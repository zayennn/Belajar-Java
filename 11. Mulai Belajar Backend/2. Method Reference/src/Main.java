// terkadang lambda itu masih terlalu panjang , contoh :
// players.forEach(p -> p.getInfo());
// java punya cara lain :
// players.forEach(Player::getInfo()); → ini disebut method reference
// bentuk umumnya :
// Class::method
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
    }
}