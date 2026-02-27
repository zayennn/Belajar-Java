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

        public static final Locale indonesia = new Locale("id", "ID");
        public static final NumberFormat formatRupiah;

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
            int totalGaji = gaji + bonus_project;
            return String.format("""
nama          : %s
kerjaan       : programmer
gaji pokok    : %s
bonus project : %s
========================== +
total gaji    : %s
""",
                    nama,
                    formatRupiah.format(gaji),
                    formatRupiah.format(bonus_project),
                    formatRupiah.format(totalGaji));
        }
    }

    static class Manager extends Employee {
        int tunjangan;
        int bonus_tim;

        Manager(String nama, int gaji, int tunjangan, int bonus_tim) {
            super(nama, gaji);
            this.tunjangan = tunjangan;
            this.bonus_tim = bonus_tim;
        }

        @Override
        String getHitungGaji() {
            int total_gaji = gaji + tunjangan + bonus_tim;

            return String.format("""
nama       : %s
kerjaan    : manager
gaji pokok : %s
tunjangan  : %s
bonus tim  : %s
========================== +
total gaji : %s
                    """,
                    nama,
                    formatRupiah.format(gaji),
                    formatRupiah.format(tunjangan),
                    formatRupiah.format(bonus_tim),
                    formatRupiah.format(total_gaji));
        }
    }

    public static void main(String[] args) {
        Employee[] daftar = new Employee[3];

        Manager manager = new Manager("capyking", 2000000, 1000000, 500000);
        Programmer programmer1 = new Programmer("capytanic", 1000000, 500000);
        Programmer programmer2 = new Programmer("capypoter", 1000000, 350000);

        daftar[0] = manager;
        daftar[1] = programmer1;
        daftar[2] = programmer2;

        for (Employee karyawan : daftar) {
            System.out.println(karyawan.getHitungGaji());
        }
    }
}