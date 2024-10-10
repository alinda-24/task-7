public class Player {
    private int x, y;
    private int score;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.score = 0;
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

    public void updateScore(boolean defeatedEnemy) {
        score += (defeatedEnemy) ? 10 : -5;
    }

    public Player shallowCopy() {
        return this;
    }

    public Player deepCopy() {
        Player copy = new Player(this.x, this.y);
        copy.score = this.score;
        return copy;
    }
}