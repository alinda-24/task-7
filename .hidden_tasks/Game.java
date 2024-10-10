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
    
    public static void main(String[] args) {
        Game game = new Game();
        game.gameLoop();
    }
}