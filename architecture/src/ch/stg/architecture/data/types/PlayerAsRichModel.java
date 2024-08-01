package ch.stg.architecture.data.types;

@SuppressWarnings("all")

public class PlayerAsRichModel {
    private final String name;
    private int points;

    public PlayerAsRichModel(String name) {
        this.name = name;
        this.points = 0;
    }

    // In einem rich Model ist die Geschäftlogik zum Teil im Model
    public void wonPoint() {
        this.points++;
    }

    public int pointsDifference(PlayerAsRichModel opponent) {
        return this.points - opponent.points;
    }


}
