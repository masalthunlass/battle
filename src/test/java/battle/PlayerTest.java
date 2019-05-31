package battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    private Player player;

    @Test
    public void shouldCreatePlayerWithEmptyDeck() {
        //given
        //when
        player = new Player("player");
        //then
        assertThat(player.getDeck()).size().isEqualTo(0);
    }

}
