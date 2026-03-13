/*

map() digunakan untuk mengubah data.
Misalnya:
Player → nama
atau
Player → score

 */

import java.util.ArrayList;

public class Main {
    static class Player {
        String nama;
        int score;

        Player(String nama, int Score) {
            this.nama = nama;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("player 1", 350));
        players.add(new Player("player 2", 321));
        players.add(new Player("player 3", 333));
        players.add(new Player("player 4", 342));
        players.add(new Player("player 5", 304));

        players.stream()
                .filter(player -> player.score > 320)
                .map(player -> player.nama)
                .forEach(System.out::println);
    }
}