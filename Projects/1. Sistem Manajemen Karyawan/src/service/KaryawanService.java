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

    public void getInfoKaryawan(Karyawan k) {
        System.out.printf("""
                Nama        : %s
                Umur        : %d
                Gaji        : %d
                Perusahaan  : %s
                
                """, k.nama, k.umur, rupiah.format(k.gaji), Karyawan.perusahaan);
    }
}