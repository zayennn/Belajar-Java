// ini adalah java modern backend
// Dipakai heavily di Spring Boot.
// konsepnya : data → stream → filter/map/sort → output
// contoh program :

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static class Player {
        String nama;
        int score;

        Player(String nama, int score) {
            this.nama = nama;
            this.score = score;
        }

        void getInfo() {
            System.out.printf("""
                    nama    : %s
                    score   : %d
                    """, nama, score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.addAll(Arrays.asList(
                new Player("capytanic", 370),
                new Player("capyking", 390),
                new Player("capypoter", 350),
                new Player("capyjayen", 320)
        ));

//        players.stream() : mengubah ArrayList<Player> menjadi Stream<Player>
        players.stream()
                .filter(p -> p.score > 350)
                .forEach(p -> p.getInfo());
    }
}