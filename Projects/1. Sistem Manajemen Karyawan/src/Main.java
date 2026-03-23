import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.text.NumberFormat;

public class Main {
    static class Karyawan implements Comparable<Karyawan> {
        private String nama;
        private int umur;
        private int gaji;

        private final static Locale indonesia = new Locale("id", "ID");
        private final static NumberFormat rupiah;

        static {
            rupiah = NumberFormat.getCurrencyInstance(indonesia);
            rupiah.setMinimumFractionDigits(0);
            rupiah.setMaximumFractionDigits(0);
        }

        Karyawan(String nama, int umur, int gaji) {
            this.nama = nama;
            this.umur = umur;
            this.gaji = gaji;
        }

        void getInfoKaryawan() {
            System.out.printf("""
                    Nama    : %s
                    Umur    : %d
                    Gaji    : %s
                    """, nama, umur, rupiah.format(gaji));
        }

        @Override
        public int compareTo(Karyawan other) {
            return other.gaji - this.gaji;
        }
    }

    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();

        karyawans.addAll(java.util.Arrays.asList(
                new Karyawan("karyawan 1", 20, 5000000),
                new Karyawan("karyawan 2", 18, 5000000),
                new Karyawan("karyawan 3", 26, 5000000)
        ));

        karyawans.forEach(Karyawan::getInfoKaryawan);
    }
}