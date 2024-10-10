# 🎮 Create Your Own Simple Game in Java

Welcome to an exciting journey of crafting a simple game application from scratch! This task will guide you through creating a game that incorporates player movement, a scoring system, and interactions with enemies. As you embark on this journey, you'll enhance your skills in navigating documentation, reading from text files, and effectively using Java's `HashMap` class.

## 📝 Task Overview

Your mission, should you choose to accept it, involves the following core components:

1. **Player Movement:** Implement basic player controls to navigate through the game environment.
2. **Scoring System:** Develop a mechanism to track and display the player's score.
3. **Enemy Interactions:** Create basic enemy behaviors that interact with the player, affecting game mechanics such as scoring or game state.

## 🚀 Learning Goals

- **Using Documentation:** Master the art of navigating official Java documentation to understand and implement classes and libraries effectively.
- **Reading from a Text File:** Gain proficiency in file I/O operations in Java, focusing on reading data from text files effectively.
- **Using the `HashMap` Class:** Dive into the intricacies of the `HashMap` class for storing and retrieving key-value pairs efficiently.

## 📚 Detailed Exercises

### Exercise 1: Understanding Java Documentation 📄

**Objective:** Develop an understanding of navigating Java's official documentation and API references.

- **Task:** Explore Java's `String` class documentation (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html). Identify at least three methods you find intriguing and explain how they might be useful in game development.
- **Reflection:** What challenges did you face while navigating the documentation, and how did you overcome them?

----

### Exercise 2: File I/O Concepts in Java 🗂️

**Objective:** Comprehend how Java handles file input operations.

- **Task:** Explain the difference between `FileReader` and `BufferedReader` classes in Java. Why is using `BufferedReader` often considered more efficient?
- **Reflection:** Imagine a scenario in your game where you need to read the player's saved score from a file. How would you approach this task?

----

### Exercise 3: Implement Basic Player Movement 🚶‍♂️

**Objective:** Translate theoretical concepts into coding practice by implementing player movement.

- **Code Task:** Create a `Player` class with fields for position (`x`, `y` coordinates). Implement methods to move the player up, down, left, and right based on simple command inputs.

  ```java
  public class Player {
      private int x;
      private int y;

      public Player(int startX, int startY) {
          this.x = startX;
          this.y = startY;
      }

      public void moveUp() { y--; }
      public void moveDown() { y++; }
      public void moveLeft() { x--; }
      public void moveRight() { x++; }

      public int getX() { return x; }
      public int getY() { return y; }
  }
  ```

- **Reflection:** How did you determine the change in coordinates for each movement?

----

### Exercise 4: Score Management with Files and `HashMap` 📊

**Objective:** Integrate file reading and `HashMap` to manage and update a player's score.

- **Code Task:** Create a method to read the player's previous scores from a file. Use a `HashMap` where the key is the player name and the value is their score.

  ```java
  public class ScoreManager {
      private HashMap<String, Integer> scores;

      public ScoreManager(String filename) {
          scores = new HashMap<>();
          try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
              String line;
              while ((line = br.readLine()) != null) {
                  String[] parts = line.split(":");
                  scores.put(parts[0], Integer.parseInt(parts[1]));
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
      }

      public Integer getScore(String playerName) {
          return scores.getOrDefault(playerName, 0);
      }
  }
  ```

- **Reflection:** How did the use of `HashMap` simplify managing player scores?

----

### Exercise 5: Developing Enemy Interactions 👾

**Objective:** Implement basic enemy interactions affecting player score or status.

- **Code Task:** Expand the game to include an `Enemy` class that interacts with the `Player`. Implement a simple collision detection on the grid, deducting points when the player encounters an enemy.

  ```java
  public class Enemy {
      private int x;
      private int y;

      public Enemy(int startX, int startY) {
          this.x = startX;
          this.y = startY;
      }

      public boolean checkCollision(Player player) {
          return this.x == player.getX() && this.y == player.getY();
      }
  }
  ```

- **Reflection:** Reflect on the challenges of implementing collision detection in a grid-based environment.

----

### Exercise 6: Integrating All Components into a Simple Game Framework 🎮

**Objective:** Synthesize all previous exercises to create a functional basic game prototype.

- **Code Task:** Incorporate all the developed components (Player movement, score management, enemy interactions) into a main game loop. Implement a way to visualize the player's and enemy's positions and track score changes.

  ```java
  public class Game {
      private Player player;
      private Enemy enemy;
      private ScoreManager scoreManager;

      public Game() {
          player = new Player(0, 0);
          enemy = new Enemy(5, 5);
          scoreManager = new ScoreManager("scores.txt");
      }

      public void gameLoop() {
          // Example loop, could use more elaborate input handling
          player.moveRight();
          if (enemy.checkCollision(player)) {
              System.out.println("Collision detected! Losing points.");
              // Deduct points logic
          }
          // Update score and display game state
      }
  }
  ```

- **Reflection:** How did integrating multiple components into a single game loop challenge your problem-solving skills? What debugging strategies worked best for you?

---

## ✅ Checklist

- [ ] Master navigation through Java documentation.
- [ ] Comprehend file I/O operations using Java.
- [ ] Implement player movement logic.
- [ ] Manage scores using files and `HashMap`.
- [ ] Develop basic enemy interactions.
- [ ] Integrate components into a cohesive game framework.

---

This task will test your ability to integrate theoretical concepts into practical application, focusing on documentation navigation, file handling, and effective use of data structures. Good luck, and enjoy your game development journey! 🎉