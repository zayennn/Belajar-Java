// collect() digunakan untuk mengubah stream menjadi collection lagi
// contoh : filter player → jadi list baru

import java.util.ArrayList;
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


}