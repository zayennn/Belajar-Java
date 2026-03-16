import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;

public class Main {
    static class Buku {
        String judul;
        String genre;
        int harga;

        private static final Locale indonesia = new Locale("id", "ID");
        private static final NumberFormat formatRupiah;

        static {
            formatRupiah = NumberFormat.getCurrencyInstance(indonesia);
            formatRupiah.setMaximumFractionDigits(0);
            formatRupiah.setMinimumFractionDigits(0);
        }

        Buku(String judul, String genre, int harga) {
            this.judul = judul;
            this.genre = genre;
            this.harga = harga;
        }

        void getInfoBukus() {
            System.out.printf("""
                    Judul buku  : %s
                    Genre       : %s
                    Harga       : %s
                    
                    """, judul, genre, formatRupiah.format(harga));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> bukus = new ArrayList<>();

        while(true) {
            System.out.println("""
                    ============================ Daftar Menu ============================
                    1. Tambah Buku
                    2. Lihat List Buku
                    3. Keluar
                    """);

            System.out.print("Masukan pilihan anda (1/2/3) : ");
            int menu = input.nextInt();
            input.nextLine();

            System.out.println("");

            switch (menu) {
                case 1 :
                    System.out.print("Masukan judul buku : ");
                    String judul = input.nextLine();
                    System.out.print("Masukan genre buku : ");
                    String genre = input.nextLine();
                    System.out.print("Masukan harga buku : ");
                    int harga = input.nextInt();

                    bukus.add(new Buku(judul, genre, harga));

                    System.out.println("Berhasil menambahkan buku " + judul);

                    break;

                case 2 :
                    if (bukus.isEmpty()) {
                        throw new IllegalArgumentException("Belum ada buku, tambah buku dulu");
                    } else {
                        for (Buku buku : bukus) {
                            buku.getInfoBukus();
                        }
                    }

                    break;

                case 3 :
                    System.out.print("Terimakasih...");
                    return;

                default:
                    throw new IllegalArgumentException("Menu yang anda pilih tidak valid!");
            }
        }
    }
}