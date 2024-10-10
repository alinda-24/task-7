import java.util.Map;
import java.util.HashMap;

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