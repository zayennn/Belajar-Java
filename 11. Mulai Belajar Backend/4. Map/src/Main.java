// map() digunakan untuk mengubah data
// misalnya : Player → nama atau Player → score

// contoh program :

import java.util.ArrayList;

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
}