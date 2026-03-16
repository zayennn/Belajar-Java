// reduce() digunakan untuk menggabungkan semua data menjadi 1 nilai, contoh : mejumlahkan score

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static class Player {
        int score;

        Player(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        players.addAll(Arrays.asList(
                new Player(100),
                new Player(328),
                new Player(254)
        ));

        int total_score =
                players.stream()
                        .map(player -> player.score)
                        .reduce(0, (a, b) -> a + b);

        System.out.println(total_score);
    }
}