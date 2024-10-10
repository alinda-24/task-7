import java.util.Random;

public class Dice {
    int value;
    Random random;

    public Dice() {
        random = new Random();
        value = random.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}