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

        int total_score =
                players.stream()
                        .map(player -> player.score)
                        .reduce(0, (a, b) -> a + b);

        System.out.println("Jumlah score : " + total_score);
        //        System.out.println("Jumlah player ");

        List<Player> top_player =
                players.stream()
                        .filter(player -> player.score > 300)
                        .collect(Collectors.toList());

        System.out.println("Jumlah player dengan score diatas 300 : " + top_player.size());
    }
}