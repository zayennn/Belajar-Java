// kadang lambda masih terlalu panjang, contoh :
// players.forEach(p -> p.getInfo());

// java menyediakan cara yang lebih bersih :
// players.forEach(Player::getInfo());

// ini di sebut dengan method reference
// bentuk umum nya adalah : Class::method

// contoh program :
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
            System.out.println("Nama : " + nama + " | " + "Score : " + score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("player 1", 100));
        players.add(new Player("player 2", 300));
        players.add(new Player("player 3", 200));

        players.forEach(Player::getInfo);
    }
}