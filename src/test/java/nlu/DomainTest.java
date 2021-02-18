package nlu;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DomainTest {

    public DomainTest() {

    }

    @Test
    public void SimpleDomainTest() {
        Domain simpleDomain = new Domain();
        Intent greeting = new Intent("Greetings");
        greeting.addUtterance(new Utterance("hello"));
        greeting.addUtterance(new Utterance("welcome"));
        greeting.addUtterance(new Utterance("aloha"));
        simpleDomain.addIntent(greeting);

        IntentHit scoredIntent = simpleDomain.interpret("hello");
        assertThat(scoredIntent.getMatchedIntent(), equalTo(greeting));
    }

    @Test
    public void EntityTest() {
        Domain pizzaDomain = new Domain();
        Intent orderFood = new Intent("Order a Pizza");
        orderFood.addUtterance(new Utterance("Can I buy a pizza from you?"));

        Entity foodTypes = new Entity();
        foodTypes.addValue("pizza");
        foodTypes.addValue("salad");
        foodTypes.addValue("breadsticks");
        foodTypes.addValue("calzone");

        Map<Range, Entity> entityMap = new HashMap<>();
        entityMap.put(new Range(30, 35), foodTypes);

        orderFood.addUtterance(new Utterance("I'd like to order a pepperoni pizza.", entityMap));
        orderFood.addUtterance(new Utterance("The food I want is pizza."));
        pizzaDomain.addIntent(orderFood);

        IntentHit scoredIntent = pizzaDomain.interpret("I'd like a sausage please.");
        assertThat(scoredIntent.getMatchedIntent(), equalTo(orderFood));
    }
}
