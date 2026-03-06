import java.awt.font.NumericShaper;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static class Product {
        private String nama;
        private int harga;

        static Locale indonesia = new Locale("id", "ID");
        static NumberFormat rupiah;

        static {
            rupiah = NumberFormat.getCurrencyInstance(indonesia);
            rupiah.setMaximumFractionDigits(0);
            rupiah.setMinimumFractionDigits(0);
        }

        Product(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }

        String setCapitalize(String nama) {
            return nama.substring(0, 1).toUpperCase() + nama.substring(1);
        }

        void getInfoProducts(int count) {
            System.out.printf("""
                    # %d  Nama Product   : %s
                         Harga Product  : %s
                    
                    """, count, setCapitalize(nama), rupiah.format(harga));
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("""
                    ================= Menu Opsi Petugas =================
                    1. Tambah Products
                    2. Tampilkan Products
                    3. Hitung Total Harga
                    4. Cari Product Termahal
                    5. Keluar
                    """);

            System.out.print("Masukan pilihan anda (1,2,3,4,5) : ");
            int opsi = input.nextInt();
            input.nextLine();

            switch (opsi) {
                case 1:
                    System.out.printf("Masukan Nama product : ");
                    String nama = input.nextLine();
                    System.out.print("Masukan harga product : ");
                    int harga = input.nextInt();

                    Product p = new Product(nama, harga);
                    products.add(p);
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("product masih kosong");
                        break;
                    } else {
                        int count = 1;
                        for (Product i : products) {
                            i.getInfoProducts(count);
                            count++;
                        }
                        break;
                    }

                case 3:
                    for (Product i : products) {
                        total += i.harga;
                    }
                    System.out.println(total);
                    break;

                default:
                    throw new IllegalArgumentException("opsi menu tidak valid!");
            }
        }
    }
}