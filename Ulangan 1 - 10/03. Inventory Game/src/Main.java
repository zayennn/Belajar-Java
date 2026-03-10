import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();

        items.putAll(Map.of(
                "Potions", 10,
                "Sword", 1,
                "Shield", 1,
                "Arrow", 25
        ));

        System.out.println(items);
    }
}