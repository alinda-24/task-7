public class Goblin extends Enemy {
    public Goblin() {
        this.health = 30;
    }

    @Override
    public void attack(Player player) {
        player.updateScore(false);
    }
}