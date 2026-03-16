// mini project

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
                new Player("Auron", 450),
                new Player("Luna", 320),
                new Player("Kira", 280),
                new Player("Zane", 500),
                new Player("Rex", 200)
        ));

        players.stream()
                .filter(player -> player.score > 300)
                .map(player -> player.nama)
                .forEach(System.out::println);
    }
}