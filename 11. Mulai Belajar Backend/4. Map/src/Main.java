// map() digunakan untuk mengubah data
// misalnya : Player → nama atau Player → score

// contoh program :

import java.util.ArrayList;
import java.util.Arrays;

public class Main{
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

        players.addAll(Arrays.asList(
                new Player("player 1", 200),
                new Player("player 2", 300),
                new Player("player 3", 250)
        ));

        players.stream()
                .map(player -> new Player(player.nama, player.score + 50))
                .sorted((a, b) -> b.score - a.score)
                .forEach(Player::getInfo);
    }
}