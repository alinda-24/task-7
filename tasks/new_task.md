# 🎮 Simple Game Application Development Task

Welcome to the Simple Game Application Development Task! In this task, you'll be creating a simple 2D game in Java that focuses on key programming concepts like randomness, decision-making, data management, and handling complex object interactions. This task is structured to gradually introduce you to essential programming concepts relevant to game development while leveraging Java's powerful libraries.

Let's dive into the exercises! 📚💻

---

## Exercise 1: 🎲 Randomness and Theory

### Objective:

Understand the use of Java's `Random` object to generate pseudo-random numbers, which are crucial for creating dynamic game experiences.

### Task:

1. **Explain the Java `Random` Object:**
   - What is the purpose of the `Random` class in Java?
   - How do you initialize a `Random` object? Provide code snippets.

### Practical Considerations:

- Explore situations in game development where using randomness can enhance game mechanics (e.g., spawning enemies, random item drops).

**Example Code Snippet:**

```java
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generates a random number between 0 (inclusive) and 100 (exclusive)
        System.out.println("Random Number: " + randomNumber);
    }
}
```

---

## Exercise 2: ❓ Ternary Operator Insights

### Objective:

Develop a solid understanding of the ternary operator and its practical use in decision-making within game logic.

### Task:

1. **Explain the Ternary Operator:**
   - What is the ternary operator, and how does it compare with traditional if-else statements?
   - Provide examples of using the ternary operator in game scenarios (e.g., health status check).

### Practical Considerations:

- Discuss how using the ternary operator can make code more concise and readable.

**Example Code Snippet:**

```java
int health = 70;
String healthStatus = (health > 50) ? "Healthy" : "In Danger";
System.out.println("Status: " + healthStatus);
```

---

## Exercise 3: 🤖 Player Movement and Deep vs. Shallow Copy

### Objective:

Integrate the concept of object copies and movement systems within the player's context in the game.

### Task:

1. **Implement Player Movement:**
   - Write a method for player movement based on directional inputs.
   - Discuss the implication of deep vs. shallow copies when duplicating the player object.

### Instructions:

- Create a `Player` class with attributes such as position, and implement a method to move the player around a grid.
- Demonstrate the effects of a shallow copy when modifying player attributes.

**Example Code Snippet:**

```java
public class Player {
    private int x, y;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move(String direction) {
        switch (direction) {
            case "UP":
                y++;
                break;
            case "DOWN":
                y--;
                break;
            case "LEFT":
                x--;
                break;
            case "RIGHT":
                x++;
                break;
        }
    }
}
```

---

## Exercise 4: 🏆 Scoring System with Ternary Logic

### Objective:

Create a scoring system for the game that uses the ternary operator for score assignment based on events (e.g., enemy interactions).

### Task:

1. **Implement a Simple Scoring System:**
   - Develop a system where the player earns points for defeating enemies and loses points otherwise.
   - Use the ternary operator to decide score changes.

### Instructions:

- Extend the `Player` class with a `score` attribute, and write a method to update scores based on interactions.

**Example Code Snippet:**

```java
public class Game {
    private int score;

    public void updateScore(boolean defeatedEnemy) {
        score += (defeatedEnemy) ? 10 : -5;
    }
}
```

---

## Exercise 5: 🐛 Debugging and Iteration

### Objective:

Enhance your debugging skills and practice modifying collections during iteration using an `Iterator`.

### Task:

1. **Identify and Fix Bugs:**
   - Given a snippet of game code with common bugs, identify and fix issues.
2. **Modify Enemy Collection:**
   - Use an `Iterator` to remove defeated enemies from a collection during iteration.

### Instructions:

- Provide a buggy code snippet and guide students in identifying and resolving bugs.
- Demonstrate how to safely remove elements from a collection during iteration.

**Example Code Snippet:**

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Game {
    public static void main(String[] args) {
        ArrayList<String> enemies = new ArrayList<>();
        enemies.add("goblin");
        enemies.add("skeleton");

        Iterator<String> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            String enemy = iterator.next();
            if (enemy.equals("skeleton")) {
                iterator.remove(); // Safe removal
            }
        }
    }
}
```

---

## Exercise 6: ⚔️ Enemy Interaction and Optional Inheritance

### Objective:

Develop a more complex interaction model using optional inheritance to reduce code duplication.

### Task:

1. **Create an Enemy Interactions System:**
   - Implement interactions between players and various enemy types.
2. **Optional: Use Inheritance:**
   - Utilize inheritance to define different types of enemies with shared behaviors.

### Instructions:

- Create a base `Enemy` class and extend it for specific enemy types.
- Implement methods for player interactions that handle different enemy behaviors.

**Example Code Snippet:**

```java
public abstract class Enemy {
    protected int health;

    public abstract void attack(Player player);
}

public class Goblin extends Enemy {
    public Goblin() {
        this.health = 30;
    }

    @Override
    public void attack(Player player) {
        player.takeDamage(5);
    }
}
```

---

🌟 **Final Notes:**

Upon completing this task, you will have built a foundation for interacting with essential programming concepts through game development. Each exercise is designed to be cumulative, leveraging skills and knowledge gained in previous steps. Embrace each challenge, and good luck with your game development journey! 🚀🎮