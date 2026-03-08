import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static class Player implements Comparable<Player> {
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

        @Override
        public int compareTo(Player other) {
            return other.score - this.score;
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.addAll(Arrays.asList(
                new Player("catherine", 340),
                new Player("zalovaurora", 390),
                new Player("jessica", 310),
                new Player("livia", 370)
        ));

        Collections.sort(players);

        for (Player p : players) {
            p.getInfo();
        }
    }
}


/*
    static class Player implements Comparable<Player> :
    itu artinya class Player punya aturan perbandingan, java sekarang tau cara bandingin player dengan player

    public int compareTo(Player other) :
    artinya :
    this = object sekarang
    other = object yang dibandingkan

    logic perbandingan :
    return this.other - this.score;

    kenapa begini ? karena descending ( terbesar dulu ), contoh :

    this.score = 340
    this.score = 390

    390 - 340 = 50 ( positif )
    artinya :
    390 lebih besar → pindah ke depan

    kalau mau ascending :
    return this.score - other.score;


    Collections.sort(players);
    ini method java untuk mengurutkan list
    karena Player sudah implements Comparable, java tau harus pake compateTo()

*/