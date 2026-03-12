import java.util.ArrayList;

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
    }
}