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

        while (true) {
            System.out.println("""
                    ================= Menu Opsi Petugas =================
                    1. Tambah Products
                    2. Tampilkan Products
                    3. Hitung Total Harga
                    4. Cari Product Termahal
                    5. Keluar
                    """);

            int opsi = input.nextInt();

            switch (opsi) {
                case 1 :
                    System.out.print("Masukan Product ke %d : ");
                    String nama = input.nextLine();
                    System.out.print("Masukan harga product : ");
                    int harga = input.nextInt();

                    Product p = new Product(nama, harga);
                    products.addAll(java.util.Arrays.asList(nama, harga));
            }
        }
    }
}