import java.util.Locale;
import java.text.NumberFormat;

public class Main {
    static class Employee {
        String nama;
        int gaji;

        Employee(String nama, int gaji) {
            this.nama = nama;
            this.gaji = gaji;
        }

        private static final Locale indonesia = new Locale("id", "ID");
        private static final NumberFormat formatRupiah;

        static {
            formatRupiah = NumberFormat.getCurrencyInstance(indonesia);
            formatRupiah.setMinimumFractionDigits(0);
            formatRupiah.setMaximumFractionDigits(0);
        }

        String getHitungGaji() {
            return formatRupiah.format(gaji);
        }
    }


}