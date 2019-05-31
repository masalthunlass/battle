package battle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Game {
    private Player playerOne, playerTwo;


    Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    void start() {
        ArrayList<Card> mixedDeck = new ArrayList<>(InitialDeck.cards);
        Collections.shuffle(mixedDeck);
        this.playerOne.setDeck(new HashSet(mixedDeck.subList(0, 26)));
        this.playerTwo.setDeck(new HashSet(mixedDeck.subList(26, 52)));
    }

    Player getPlayerOne() {
        return this.playerOne;
    }

    Player getPlayerTwo() {
        return this.playerTwo;
    }
}
