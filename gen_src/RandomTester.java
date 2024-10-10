The following is the structure of the Java class with method signatures only:

```java
import java.util.List;
import java.util.ArrayList;

public class RandomTester {

    public static ArrayList<Integer> generateNumbers(int n) {
        // Method to generate numbers
    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> list) {
        // Method to shuffle a list
    }

    public static ArrayList<Dice> sequenceOfDice(int n) {
        // Method to create a sequence of dice
    }

    public static int highestAdjacentRolls(ArrayList<Dice> sequence) {
        // Method to find highest adjacent rolls in a dice sequence
    }

    public static int smallestAdjacentRolls(ArrayList<Dice> sequence) {
        // Method to find smallest adjacent rolls in a dice sequence
    }

    public static ArrayList<Dice> remove(ArrayList<Dice> sequence, int n) {
        // Method to remove dice with a specific value from the sequence
    }
}
```

Please note that the `Dice` class or interface needs to be defined elsewhere in your codebase for these methods to work correctly.