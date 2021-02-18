package nlu;

import java.util.ArrayList;
import java.util.List;

/**
 * An Intent contains training utterances that define the kinds of text expected to be classified as this intent.
 */
public class Intent {

    private String name;
    private List<Utterance> utterances = new ArrayList<>();

    public Intent(String name) {
        this.name = name;
    }

    public void addUtterance(Utterance utterance) {
        utterances.add(utterance);
    }

    public String toString() {
        return name;
    }
}
