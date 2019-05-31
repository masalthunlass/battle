package battle;

import java.util.Objects;

public class Card {
    private CardValue value;
    private CardColour colour;

    Card(CardValue value, CardColour colour) {
        this.colour = colour;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value &&
                colour == card.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, colour);
    }
}
