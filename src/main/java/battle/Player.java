package battle;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {

    private String name;
    private Set deck = new HashSet();

    Player(String name) {
        this.name = name;
    }


    Set getDeck() {
        return deck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    void initDeck() {

    }

}
