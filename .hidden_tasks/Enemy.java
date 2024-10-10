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