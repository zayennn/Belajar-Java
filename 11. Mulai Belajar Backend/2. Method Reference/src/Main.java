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


}