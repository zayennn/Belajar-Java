import java.util.ArrayList;

public class Main {
    static class Buku {
        private String judul_buku;
        private String penulis;
        private int tahun;

        Buku(String judul_buku, String penulis, int tahun) {
            this.judul_buku = judul_buku;
            this.penulis = penulis;
            this.tahun = tahun;
        }

        void getInfo() {
            System.out.printf("""
judul buku      :   %s
penulis buku    :   %s
tahun terbit    :   %d

                    """, judul_buku, penulis, tahun);
        }
    }

    public static void main(String[] args) {
        ArrayList<Buku> bukus = new ArrayList<>();

        bukus.add(new Buku("buku 1", "fulan", 2023));
        bukus.add(new Buku("buku 2", "fulana", 2024));

        for (Buku buku : bukus) {
            buku.getInfo();
        }
    }
}