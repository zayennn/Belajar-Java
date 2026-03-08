/*
    ini java modern, kalau sebelumnya Comparable/Comparator itu panjang dan jelek,
    bisa di pendekin jadi :
    players.sort((a,b) -> b.score - a.score);

    contoh :
*/

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
                new Player("capypoter", 320),
                new Player("capyjayen", 310)
        ));

//        (a,b) artinya Player a dan Player b
//        -> artinya return
        players.sort((a, b) -> b.score - a.score);
//        jadi sebenernya :
//        (a,b) -> b.score - a.score itu sama dengan :
        /*
            public int compareTo(Player a, Player b) {
                return b.score - a.score;
            }
        */

        for (Player p : players) {
            p.getInfo();
        }
    }
}