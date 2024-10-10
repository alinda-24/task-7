package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GoblinTest {

    @Test
    public void testAttack() {
        Player player = new Player(0, 0);
        Goblin goblin = new Goblin();
        goblin.attack(player);

        assertEquals(-5, player.score); // Assuming player did not defeat goblin and got -5 score
    }
}

