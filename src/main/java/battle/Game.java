package battle;

class Game {
    private String playerOne, playerTwo;

    void start(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

    }

    String getPlayerOne() {
        return this.playerOne;
    }

    String getPlayerTwo() {
        return this.playerTwo;
    }
}
