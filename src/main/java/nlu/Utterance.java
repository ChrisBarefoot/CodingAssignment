package nlu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * An Utterance is a singular piece of training data for an Intent. An utterance may optionally have entity values
 * which can offer variability as well as importance to certain words in a training utterance.
 */
public class Utterance {
    private String text;
    private Map<Range, Entity> entities = new HashMap<>();

    public Utterance(String text) {
        this.text = text;
    }

    public Utterance(String text, Map<Range, Entity> entities) {
        this.text = text;
        this.entities = entities;
    }

    private List<String> getTokens() {
        return Arrays.asList(this.text.split(" "));
    }
}
