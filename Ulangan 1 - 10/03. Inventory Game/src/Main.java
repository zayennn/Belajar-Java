import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int total = 0;
        int max = 0;

        items.putAll(Map.of(
                "Potions", 10,
                "Sword", 1,
                "Shield", 1,
                "Arrow", 25
        ));

        while (true) {
            System.out.println("""
                    ==================== Menu Option ====================
                    1. Tampikan semua items
                    2. Tampilkan total semua items
                    3. Tampilkan items dengan jumlah terbanyak
                    """);

            System.out.print("Masukan pilihan anda : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    for (Map.Entry<String, Integer> i : items.entrySet()) {
                        System.out.printf("""
                                Items   : %s
                                Jumlah  : %d
                                
                                """, i.getKey(), i.getValue());
                    }
                    break;
                case 2:
                    for (int v : items.values()) {
                        total += v;
                    }

                    System.out.println("Total jumlah items di inventory kamu adalah : " + total);

                    break;
            }
        }
    }
}