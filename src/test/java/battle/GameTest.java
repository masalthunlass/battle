package battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    private Game game = new Game();

    @Test
    public void shouldGameStartsWithTwoPlayers() {
        //given
        final String playerOne = "PlayerOne";
        final String playerTwo = "PlayerTwo";
        //when
        this.game.start(playerOne, playerTwo);
        //then
        assertThat(this.game.getPlayerOne()).isNotNull();
        assertThat(this.game.getPlayerTwo()).isNotNull();
        assertThat(this.game.getPlayerOne()).isEqualTo(playerOne);
        assertThat(this.game.getPlayerTwo()).isEqualTo(playerTwo);

    }
}
