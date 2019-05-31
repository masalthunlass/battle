package battle;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        final Player playerOne = new Player("1");
        final Player playerTwo = new Player("2");
        this.game = new Game(playerOne, playerTwo);
    }

    @Test
    public void assertThatNewGameHasTwoPlayers() {
        //then
        assertThat(this.game.getPlayerOne()).isNotNull();
        assertThat(this.game.getPlayerTwo()).isNotNull();
    }

    @Test
    public void shouldGameStartsWithBothPlayersHaving26DifferentCards() {
        //when
        this.game.start();
        //then
      assertThat(this.game.getPlayerOne().getDeck()).size().isEqualTo(26);
        assertThat(this.game.getPlayerTwo().getDeck()).size().isEqualTo(26);
        assertThat(this.game.getPlayerOne().getDeck()).doesNotContainAnyElementsOf(this.game.getPlayerTwo().getDeck());
    }
}
