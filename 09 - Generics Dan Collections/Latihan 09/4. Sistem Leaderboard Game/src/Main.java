import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Player {
        private String nama;
        private int score;

        Player(String nama, int score) {
            this.nama = nama;
            this.score = score;
        }

        void getInfo(int count) {
            System.out.printf("""
                    ========== Player Ke - %d ==========
                    Nama    :   %s
                    Score   :   %d
                    
                    """, count, nama, score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        int total = 0;
        int max = 0;
        int rata_rata;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah player : ");
        int jum_players = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jum_players; i++) {
            System.out.printf("Masukan nama player ke - %d : ", i + 1);
            String nama = input.nextLine();

            System.out.printf("Masukan score player ke - %d : ", i + 1);
            int score = input.nextInt();
            input.nextLine();

            Player p = new Player(nama, score);
            players.add(p);
        }

        int count = 1;
        for (Player p : players) {
            if (max < p.score) {
                max = p.score;
            }

            total += p.score;

            p.getInfo(count);
            count++;

        }

        rata_rata = total / jum_players;

        System.out.println("Score tertinggi adalah : " + max);
        System.out.println("Total score : " + total);
        System.out.println("Rata rata score : " + rata_rata);
    }
}