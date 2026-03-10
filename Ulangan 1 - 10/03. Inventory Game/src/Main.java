import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        Scanner input = new Scanner(System.in);

        items.putAll(Map.of(
                "Potions", 10,
                "Sword", 1,
                "Shield", 1,
                "Arrow", 25
        ));

        for (Map.Entry<String, Integer> i : items.entrySet()) {
            while(true) {
                System.out.println("""
                        ==================== Menu Option ====================
                        """);
            }
        }
    }
}