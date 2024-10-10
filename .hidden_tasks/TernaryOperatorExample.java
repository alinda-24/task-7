public class TernaryOperatorExample {
    public static void main(String[] args) {
        int health = 70;
        String healthStatus = (health > 50) ? "Healthy" : "In Danger";
        System.out.println("Status: " + healthStatus);
    }
}