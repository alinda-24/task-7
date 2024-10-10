package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTesterTest {
    
    @Test
    public void testGenerateNumbers() {
        ArrayList<Integer> numbers = RandomTester.generateNumbers(10);
        assertEquals(10, numbers.size());

        ArrayList<Integer> emptyNumbers = RandomTester.generateNumbers(0);
        assertEquals(0, emptyNumbers.size());
    }

    @Test
    public void testGenerateNumbersNegative() {
        // Testing with negative input should ideally be handled separately, or disallowed
        ArrayList<Integer> numbers = RandomTester.generateNumbers(-5);
        assertEquals(0, numbers.size()); // Expect empty list
    }

    @Test
    public void testShuffle() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> shuffled1 = RandomTester.shuffle(list);
        ArrayList<Integer> shuffled2 = RandomTester.shuffle(list);

        assertNotEquals(list, shuffled1); // Should not be in the original order

        HashSet<Integer> set1 = new HashSet<>(list);
        HashSet<Integer> set2 = new HashSet<>(shuffled1);
        assertEquals(set1, set2); // Check that contents are the same

        assertNotEquals(shuffled1, shuffled2); // Two shuffles should produce different orders
    }

    @Test
    public void testSequenceOfDice() {
        ArrayList<Dice> sequence = RandomTester.sequenceOfDice(5);
        assertEquals(5, sequence.size());

        for (Dice d: sequence) {
            assertTrue(d.getValue() >= 1 && d.getValue() <= 6);
        }
    }
    
    @Test
    public void testHighestAdjacentRolls() {
        ArrayList<Dice> diceList = new ArrayList<>(Arrays.asList(new Dice[]{ new Dice(), new Dice(), new Dice() }));
        int highest = RandomTester.highestAdjacentRolls(diceList);
        assertTrue(highest >= 2 && highest <= 12);
    }

    @Test
    public void testSmallestAdjacentRolls() {
        ArrayList<Dice> diceList = new ArrayList<>(Arrays.asList(new Dice[]{ new Dice(), new Dice(), new Dice() }));
        int smallest = RandomTester.smallestAdjacentRolls(diceList);
        assertTrue(smallest >= 2 && smallest <= 12);
    }

    @Test
    public void testRemove() {
        ArrayList<Dice> diceList = new ArrayList<>(Arrays.asList(new Dice[]{ new Dice(), new Dice(), new Dice() }));
        int valueToRemove = diceList.get(0).getValue();
        ArrayList<Dice> result = RandomTester.remove(diceList, valueToRemove);
        for (Dice d : result) {
            assertFalse(d.getValue() == valueToRemove);
        }
    }
}

