import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;

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

        void getInfoProducts(int count) {
            System.out.printf("""
                    ================= Menu Product =================
                    %d. Nama Product   : %s
                       Harga Product  : %s
                    """, count, nama, rupiah.format(harga));
        }
    }

    public static void main(String[] args) {
        Product products = new Product("bakso", 10000);

        products.getInfoProducts(1);
    }
}