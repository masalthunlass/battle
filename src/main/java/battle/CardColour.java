package battle;

public enum CardColour {
    DIAMONDS("DIAMONDS"), HEARTS("HEARTS"), SPADES("SPADES"), CLUBS("CLUBS");

    private String id;
    CardColour(String id) {
       this.id = id;
    }
}
