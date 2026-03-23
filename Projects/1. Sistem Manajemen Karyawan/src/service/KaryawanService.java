package service;

import model.Karyawan;
import java.util.Locale;
import java.text.NumberFormat;

public class KaryawanService {
    static class FormatNumber {
        private final static  Locale indonesia = new Locale("id", "ID");
        private final static NumberFormat rupiah;

        static {
            rupiah = NumberFormat.getCurrencyInstance(indonesia);
            rupiah.setMaximumFractionDigits(0);
            rupiah.setMinimumFractionDigits(0);
        }
    }

    public static Karyawan cariNama(java.util.List<Karyawan> list, String nama) {
        for (Karyawan k : list) {
            if (k.nama.equalsIgnoreCase(nama)) {
                return k;
            }
        }

        return null;
    }

    public static void getInfoKaryawan(Karyawan karyawan) {
        System.out.printf("""
                Nama    : %s
                Umur    : %d
                Gaji    : %s
                
                """, karyawan.nama, karyawan.umur, FormatNumber.rupiah.format(karyawan.gaji));
    }
}
