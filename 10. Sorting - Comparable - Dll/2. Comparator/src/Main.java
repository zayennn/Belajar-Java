/*
    kadang kita gamau ubah class , misalnya Player punya :
    nama, score, level

    kita bisa sort menggunakan berbagai hal, contoh :
    sort by score
    sort by name
    sort by level

    makanya java punya Comparator
    contoh program :
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
                new Player("capytanic", 340),
                new Player("capyking", 390),
                new Player("capypoter", 310),
                new Player("capyjayen", 290)
        ));

//        players.sort adalah method dari ArrayList yang isi nya kita kasih Comparator
//        new Comparator<Player>() adalah aturan membandingkan player
        players.sort(new Comparator<Player>() {
            @Override
//            compare(Player a, Player b) artinya membandingkan object a dengan object b
            public int compare(Player a, Player b) {
                return b.score - a.score;
            }
        });


        for (Player p : players) {
            p.getInfo();
        }
    }
}