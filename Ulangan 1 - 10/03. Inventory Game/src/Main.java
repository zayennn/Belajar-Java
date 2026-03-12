import java.util.HashMap;

public class Main {
    static class Items {
        String nama;
        int jumlah;

        Items(String nama, int jumlah) {
            this.nama = nama;
            this.jumlah = jumlah;
        }

        void getInfo() {
            System.out.printf("""
                    Nama Item   : %s
                    Jumlah Item : %d
                    """, nama, jumlah);
        }

        public static void main(String[] args) {

        }
    }
}