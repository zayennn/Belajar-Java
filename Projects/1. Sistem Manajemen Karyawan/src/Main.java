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



        @Override
        public int compareTo(Karyawan o) {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}