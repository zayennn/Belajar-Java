import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    /*
        Class Player merepresentasikan object pemain.

        implements Comparable<Player>
        artinya class Player punya "aturan perbandingan"
        supaya Java tahu bagaimana membandingkan Player dengan Player
        ketika proses sorting dilakukan.

        Tanpa Comparable, Java tidak tahu bagaimana
        mengurutkan object Player.
     */
    static class Player implements Comparable<Player> {

        String nama;
        int score;

        /*
            Constructor untuk membuat object Player
            contoh:
            new Player("catherine", 340)
         */
        Player(String nama, int score) {
            this.nama = nama;
            this.score = score;
        }

        /*
            Method sederhana untuk menampilkan data player
         */
        void getInfo() {
            System.out.printf("""
                    nama    : %s
                    score   : %d
                    """, nama, score);
        }

        /*
            Method compareTo() adalah method wajib
            jika kita menggunakan Comparable.

            Method ini dipakai oleh Java untuk membandingkan
            dua object Player saat proses sorting.

            Parameter:
            other = object Player yang akan dibandingkan dengan object sekarang.

            this = object yang sedang menjalankan method ini.
         */
        @Override
        public int compareTo(Player other) {

            /*
                Contoh situasi:

                Player A = 340
                Player B = 390

                Jika Java memanggil:

                A.compareTo(B)

                maka:
                this  = A
                other = B

                this.score  = 340
                other.score = 390
             */

            /*
                Logic sorting descending (nilai terbesar dulu)

                rumus:
                return other.score - this.score

                contoh:

                other.score = 390
                this.score  = 340

                390 - 340 = 50 (positif)

                aturan compareTo:

                hasil > 0  → object this pindah ke belakang
                hasil < 0  → object this tetap di depan
                hasil = 0  → dianggap sama

                karena hasil positif,
                maka player dengan score lebih besar
                akan dipindah ke depan.
             */
            return other.score - this.score;
        }
    }

    public static void main(String[] args) {

        /*
            Membuat ArrayList untuk menyimpan object Player

            ArrayList adalah collection yang ukurannya dinamis.
            Berbeda dengan array biasa yang ukurannya tetap.
         */
        ArrayList<Player> players = new ArrayList<>();

        /*
            Arrays.asList(...) digunakan untuk membuat list sementara
            lalu dimasukkan ke ArrayList dengan addAll()

            Di sini kita membuat 4 object Player sekaligus.
         */
        players.addAll(Arrays.asList(
                new Player("catherine", 340),
                new Player("zalovaurora", 390),
                new Player("jessica", 310),
                new Player("livia", 370)
        ));

        /*
            Collections.sort(players)

            Method ini digunakan untuk mengurutkan isi list.

            Karena class Player sudah implements Comparable,
            Java otomatis memakai method compareTo()
            untuk menentukan urutan object Player.
         */
        Collections.sort(players);

        /*
            Foreach loop untuk menampilkan semua Player
            setelah proses sorting selesai.
         */
        for (Player p : players) {
            p.getInfo();
        }
    }
}