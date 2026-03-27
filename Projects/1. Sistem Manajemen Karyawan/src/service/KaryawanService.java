package service;

import model.Karyawan;

import java.util.Locale;
import java.text.NumberFormat;

public class KaryawanService {
    private static final Locale indonesia = new Locale("id", "ID");
    private static final NumberFormat rupiah;

    static {
        rupiah = NumberFormat.getCurrencyInstance(indonesia);
        rupiah.setMinimumFractionDigits(0);
        rupiah.setMaximumFractionDigits(0);
    }

    public static Karyawan getNamaKaryawan(java.util.List<Karyawan> list, String nama) {
        for (Karyawan k : list) {
            if (k.nama.equalsIgnoreCase(nama)) {
                return k;
            }
        }

        return null;
    }

    public static void getInfoKaryawan(Karyawan k) {
        System.out.printf("""
                Nama        : %s
                Umur        : %d
                Gaji        : %s
                
                """, k.nama, k.umur, rupiah.format(k.gaji));
    }
}