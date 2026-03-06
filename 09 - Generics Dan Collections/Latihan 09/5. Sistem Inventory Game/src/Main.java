import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();

        items.put("potions", 10);
        items.put("sword", 1);
        items.put("arrows", 25);
        items.put("shield", 1);

        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.printf("%s : %d\n", item.getKey(), item.getValue());
        }
    }
}