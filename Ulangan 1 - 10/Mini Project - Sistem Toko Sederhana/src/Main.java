import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    static class Products {
        private String nama;
        private int harga;

        private static Locale indonesia = new Locale("id", "ID");
        private static NumberFormat rupiah;

        static {
            rupiah = NumberFormat.getCurrencyInstance(indonesia);
            rupiah.setMaximumFractionDigits(0);
            rupiah.setMaximumFractionDigits(0);
        }

        Products(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }

        void getInfo() {
            System.out.printf("""
                    Nama Product    : %s
                    Harga Product   : %s
                    
                    """, nama, rupiah.format(harga));
        }
    }

    public static void main(String[] args) {
        ArrayList<Products> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int total = 0;
        int max = 0;

        while (true) {
            System.out.println("""
                    ==================== Opsi Menu ====================
                    1. Tambah product
                    2. Tampilkan product
                    3. Total harga
                    4. Product termahal
                    5. Keluar
                    """);

            System.out.print("Masukan pilihan anda (1/2/3/4/5) : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 :
                    System.out.print("Nama product : ");
                    String nama = input.nextLine();

                    System.out.print("Harga product : ");
                    int harga = input.nextInt();
                    input.nextLine();

                    products.addAll(Arrays.asList(
                            new Products(nama, harga)
                    ));

                    break;

                case 2 :
                    for (Products p : products) {
                        p.getInfo();
                    }
                    break;

                case 3 :
                    for (Products p : products) {
                        total += p.harga;
                    }
                    System.out.println(Products.rupiah.format(total));
                    break;

                case 4 :
                    for (Products p : products ) {
                        if (p.harga > max) {
                            max = p.harga;
                        }
                    }

                    System.out.println(Products.rupiah.format(max));
            }
        }
    }
}