import java.util.HashMap;
import java.util.Map;

public class exam5 {
  public static void main(String[] args) {
    String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing",
        "baseball","boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer" };

    Map<String, Integer> countMap = new HashMap<>();

    for (String sport : sports) {
      if (countMap.containsKey(sport)) {
        countMap.put(sport, countMap.get(sport) + 1);
      } else {
        countMap.put(sport, 1);
      }
    }

    String maxSport = "";
    int maxCount = 0;

    for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        maxSport = entry.getKey();
      }
    }

    System.out.println("==================");
    System.out.println("最も出現回数の多いスポーツは " + maxSport + " で、出現回数は " + maxCount + " 回です");
    System.out.println("==================");
  }
}
