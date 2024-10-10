// File: Game.java
import java.util.List;
import java.util.ArrayList;

public class Game {
    private ArrayList<String> enemies;

    public Game() {
        // Constructor
    }

    public void addEnemy(String enemy) {
        // Adds an enemy to the list
    }

    public void updateEnemies() {
        // Updates the enemies list
    }

    public static void main(String[] args) {
        // Entry point of the program
    }
}

// File: Enemy.java
public abstract class Enemy {
    protected int health;

    public abstract void attack(Player player);
}