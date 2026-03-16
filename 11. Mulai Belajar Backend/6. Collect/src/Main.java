// collect() digunakan untuk mengubah stream menjadi collection lagi
// contoh : filter player → jadi list baru

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
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.addAll(Arrays.asList(
                new Player("player 1", 100),
                new Player("player 2", 250),
                new Player("player 3", 375),
                new Player("player 4", 287),
                new Player("player 5", 310)
        ));

        List<Player> high_score =
                players.stream()
                        .filter(player -> player.score > 250)
                        .collect(Collectors.toList());

        System.out.println("jumlah player high score : " + high_score.size());
    }
}