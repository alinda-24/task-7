package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testAddAndUpdateEnemies() {
        Game game = new Game();
        game.addEnemy("skeleton");
        game.addEnemy("goblin");
        assertEquals(2, game.enemies.size());

        game.updateEnemies();
        assertEquals(1, game.enemies.size());
        assertFalse(game.enemies.contains("skeleton"));
        assertTrue(game.enemies.contains("goblin"));
    }
}

