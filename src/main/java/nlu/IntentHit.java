package nlu;

public class IntentHit {

    private Intent matchedIntent;
    private double score;

    public IntentHit(Intent matchedIntent, double score) {
        this.matchedIntent = matchedIntent;
        this.score = score;
    }

    public Intent getMatchedIntent() {
        return matchedIntent;
    }

}
