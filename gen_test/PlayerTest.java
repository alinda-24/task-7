package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testMove() {
        Player player = new Player(0, 0);
        player.move("UP");
        assertEquals(1, player.y);

        player.move("RIGHT");
        assertEquals(1, player.x);

        player.move("DOWN");
        assertEquals(0, player.y);

        player.move("LEFT");
        assertEquals(0, player.x);
    }

    @Test
    public void testUpdateScore() {
        Player player = new Player(0, 0);
        player.updateScore(true);
        assertEquals(10, player.score);

        player.updateScore(false);
        assertEquals(5, player.score);
    }

    @Test
    public void testShallowCopy() {
        Player player1 = new Player(0, 0);
        Player player2 = player1.shallowCopy();

        assertEquals(player1, player2);
    }

    @Test
    public void testDeepCopy() {
        Player player1 = new Player(0, 0);
        Player player2 = player1.deepCopy();

        assertEquals(player1.x, player2.x);
        assertEquals(player1.y, player2.y);
        assertEquals(player1.score, player2.score);

        player1.x++;
        assertNotEquals(player1.x, player2.x);
    }
}

