package nlu;

import java.util.ArrayList;
import java.util.List;

public class Entity {

    private List<String> values = new ArrayList<>();

    public Entity() {

    }

    public void addValue(String value) {
        this.values.add(value);
    }

    public boolean isMatch(String value) {
        return this.values.contains(value);
    }
}
