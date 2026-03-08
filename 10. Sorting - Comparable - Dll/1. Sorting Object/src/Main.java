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