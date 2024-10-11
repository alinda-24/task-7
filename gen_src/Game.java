Game.java
```java
public class Game {

    private Player player;
    private Enemy enemy;
    private ScoreManager scoreManager;

    public Game() {
    }

    public void gameLoop() {
    }

    public static void main(String[] args) {
    }
}
```

Player.java
```java
public class Player {

    public Player(int x, int y) {
    }

    public void moveRight() {
    }
}
```

Enemy.java
```java
public class Enemy {

    public Enemy(int x, int y) {
    }

    public boolean checkCollision(Player player) {
        return false;
    }
}
```

ScoreManager.java
```java
public class ScoreManager {

    public ScoreManager(String fileName) {
    }
}
```