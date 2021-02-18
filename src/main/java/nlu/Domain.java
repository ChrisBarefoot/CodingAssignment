package nlu;

import java.util.ArrayList;
import java.util.List;

/**
 * A domain is a classifier of text into one of the provided intents within the domain.
 */
public class Domain {

    private List<Intent> intents = new ArrayList<>();

    public Domain() {

    }

    public void addIntent(Intent intent) {
        this.intents.add(intent);
    }

    public IntentHit interpret(String text) {
        double score = 0.0;
        Intent bestIntent = intents.get(0);

        //TODO pick best intent here

        return new IntentHit(bestIntent, score);
    }
}
