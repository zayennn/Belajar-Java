// ini adalah java modern backend
// Dipakai heavily di Spring Boot.
// konsepnya : data → stream → filter/map/sort → output
// contoh program :

import java.util.ArrayList;

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
    }
}