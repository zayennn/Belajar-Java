import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        int max = 0;
        String namaMax = "";

        items.putAll(Map.of(
                "Potions", 10,
                "Sword", 1,
                "Shield", 1,
                "Arrows", 25
        ));

        for (Map.Entry<String, Integer> i : items.entrySet()) {
            System.out.printf("""
                    Nama item   : %s
                    Jumlah Item : %d
                    
                    """, i.getKey(), i.getValue());
        }

        for (Map.Entry<String, Integer> i : items.entrySet()) {
            if (i.getValue() > max) {
                max = i.getValue();
                namaMax = i.getKey();
            }
        }

        System.out.printf("""
                Jumlah items terbanyak :
                Nama Item   : %s
                Jumlah item : %d
                """, namaMax, max);
    }
}