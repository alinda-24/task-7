import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomTester {

    public static ArrayList<Integer> generateNumbers(int n) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt());
        }
        return numbers;
    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> list) {
        ArrayList<Integer> copy = new ArrayList<Integer>(list);
        ArrayList<Integer> shuffled = new ArrayList<Integer>();
        Random random = new Random();
        while (copy.size() > 0) {
            int index = random.nextInt(copy.size());
            shuffled.add(copy.remove(index));
        }
        return shuffled;
    }

    public static ArrayList<Dice> sequenceOfDice(int n) {
        ArrayList<Dice> dice = new ArrayList<Dice>();
        for (int i = 0; i < n; i++) {
            dice.add(new Dice());
        }
        return dice;
    }

    public static int highestAdjacentRolls(ArrayList<Dice> sequence) {
        int res = 0;
        for (int i = 0; i < sequence.size() - 1; i++) {
            if (sequence.get(i).getValue() + sequence.get(i + 1).getValue() > res) {
                res = sequence.get(i).getValue() + sequence.get(i + 1).getValue();
            }
        }
        return res;
    }

    public static int smallestAdjacentRolls(ArrayList<Dice> sequence) {
        if (sequence.size() < 0) {
            return 0;
        }
        int res = sequence.get(0).getValue() + sequence.get(1).getValue();

        for (int i = 2; i < sequence.size() - 1; i++) {
            if (sequence.get(i).getValue() + sequence.get(i + 1).getValue() < res) {
                res = sequence.get(i).getValue() + sequence.get(i + 1).getValue();
            }
        }
        return res;
    }

    public static ArrayList<Dice> remove(ArrayList<Dice> sequence, int n) {
        ArrayList<Dice> res = new ArrayList<Dice>(sequence);
        Iterator<Dice> it = res.iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == n) {
                it.remove();
            }
        }
        return res;
    }
}