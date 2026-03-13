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

        void getInfo() {
            System.out.println(nama + " | " + score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("player 1", 350));
        players.add(new Player("player 2", 321));
        players.add(new Player("player 3", 333));
        players.add(new Player("player 4", 342));
        players.add(new Player("player 5", 304));

        players.forEach(Player::getInfo);
    }
}

// players.forEach(Player::getInfo); artinya adalah :
// pada setiap player jalankan method getInfo
// kalau versi lambda :
// players.forEach(p -> p.getInfo());
// hasil nya sama saja cuma method reference lebih pendek