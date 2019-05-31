package battle;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        final Player playerOne = mock(Player.class);
        final Player playerTwo = mock(Player.class);
        this.game = new Game(playerOne, playerTwo);
    }

    @Test
    public void assertThatNewGameHasTwoPlayers() {
        //then
        assertThat(this.game.getPlayerOne()).isNotNull();
        assertThat(this.game.getPlayerTwo()).isNotNull();
    }

    @Test
    public void shouldGameStartsWithBothPlayersHavingInitialDeck() {
        //when
        this.game.start();
        //then
        verify(this.game.getPlayerOne(), times(1)).initDeck();
        verify(this.game.getPlayerTwo(), times(1)).initDeck();
    }
}
