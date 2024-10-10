package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryOperatorExampleTest {
    
    @Test
    public void testTernaryOperation() {
        int health = 70;
        String healthStatus = (health > 50) ? "Healthy" : "In Danger";
        assertEquals("Healthy", healthStatus);

        health = 40;
        healthStatus = (health > 50) ? "Healthy" : "In Danger";
        assertEquals("In Danger", healthStatus);
    }
}