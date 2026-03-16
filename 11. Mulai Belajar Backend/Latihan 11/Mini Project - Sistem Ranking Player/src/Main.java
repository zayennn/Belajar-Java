// mini project

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static class Player {
        String nama;
        int score;

        Player(String nama, int score) {
            this.nama = nama;
            this.score = score;
        }

        void tampil() {
            System.out.println("Nama : " + nama + " | " + "Score : " + score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.addAll(Arrays.asList(
                new Player("player 1", 250),
                new Player("player 2", 226),
                new Player("player 3", 375),
                new Player("player 4", 410),
                new Player("player 5", 300)
        ));


    }
}