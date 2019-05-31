package battle;

class Game {
    private Player playerOne, playerTwo;

     Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    void start(){
         this.playerOne.initDeck();
         this.playerTwo.initDeck();
    }

    Player getPlayerOne() {
        return this.playerOne;
    }

    Player getPlayerTwo() {
        return this.playerTwo;
    }
}
