import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static class Player {
        private String nama;
        private int score;

        Player(String nama, int score) {
            this.nama = nama;
            this.score = score;
        }

        void getInfo() {
            System.out.printf("""
                    Nama    : %s
                    Score   : %d
                    
                    """, nama, score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.addAll(Arrays.asList(
            new Player("Player 1", 256),
            new Player("Player 2", 451),
            new Player("Player 3", 342),
            new Player("Player 4", 225),
            new Player("Player 5", 299)
        ));

        players.sort((a, b) -> b.score - a.score);

        for (Player player : players) {
            if (player.score >= 300) {
                player.getInfo();
            }
        }
    }
}