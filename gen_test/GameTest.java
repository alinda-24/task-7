package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private Game game;
    private Player player;
    private Enemy enemy;
    private BufferedWriter writer;

    @Before
    public void setUp() {
        game = new Game();
        player = new Player(0, 0);
        enemy = new Enemy(5, 5);
    }

    @Test
    public void testPlayerMovesRight() {
        player.moveRight();
        assertEquals(1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testPlayerMovesUp() {
        player.moveUp();
        assertEquals(0, player.getX());
        assertEquals(-1, player.getY());
    }

    @Test
    public void testPlayerMovesDown() {
        player.moveDown();
        assertEquals(0, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    public void testPlayerMovesLeft() {
        player.moveLeft();
        assertEquals(-1, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testEnemyCollisionDetection() {
        Player otherPlayer = new Player(5, 5);
        assertTrue(enemy.checkCollision(otherPlayer));
    }

    @Test
    public void testEnemyNoCollision() {
        Player otherPlayer = new Player(1, 1);
        assertFalse(enemy.checkCollision(otherPlayer));
    }

    @Test(expected = IOException.class)
    public void testScoreManagerFileNotFound() throws IOException {
        ScoreManager scoreManager = new ScoreManager("invalid-scores.txt");
    }

    // Helper method to create a temporary scores file for testing
    private void createTestScoresFile(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("player1:100\n");
        writer.write("player2:150\n");
        writer.close();
    }

    @Test
    public void testValidScoreRetrieval() throws IOException {
        createTestScoresFile("scores.txt");
        ScoreManager scoreManager = new ScoreManager("scores.txt");
        assertEquals((Integer) 100, scoreManager.getScore("player1"));
    }

    @Test
    public void testScoreManagerDefaultScore() throws IOException {
        createTestScoresFile("scores.txt");
        ScoreManager scoreManager = new ScoreManager("scores.txt");
        assertEquals((Integer) 0, scoreManager.getScore("unknownPlayer"));
    }

    // Considering Performance
    @Test(timeout = 100)
    public void testPerformanceForScoreRetrieval() throws IOException {
        createTestScoresFile("scores.txt");
        ScoreManager scoreManager = new ScoreManager("scores.txt");
        for (int i = 0; i < 1000; i++) {
            scoreManager.getScore("player1");
        }
    }
}