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

    static class Programmer extends Employee {
        int bonus_project;

        Programmer(String nama, int gaji, int bonus_project) {
            super(nama, gaji);
            this.bonus_project = bonus_project;
        }

        @Override
        String getHitungGaji() {
            return String.format("""
nama       : %s
gaji pokok : %d
total gaji : %d
                    """, nama, gaji, (gaji += bonus_project));
        }
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("capypoter", 100000, 50000);
        System.out.println(programmer.getHitungGaji());
    }
}