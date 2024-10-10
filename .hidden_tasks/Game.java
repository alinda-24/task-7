import java.util.List;
import java.util.ArrayList;

public class Game {
    private ArrayList<String> enemies;

    public Game() {
        enemies = new ArrayList<>();
    }

    public void addEnemy(String enemy) {
        enemies.add(enemy);
    }

    public void updateEnemies() {
        Iterator<String> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            String enemy = iterator.next();
            if (enemy.equals("skeleton")) {
                iterator.remove(); // Safe removal
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.addEnemy("goblin");
        game.addEnemy("skeleton");
        game.updateEnemies();
    }
}

public abstract class Enemy {
    protected int health;

    public abstract void attack(Player player);
}