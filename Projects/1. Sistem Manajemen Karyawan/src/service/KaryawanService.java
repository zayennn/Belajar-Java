package service;

import model.Karyawan;

import java.util.Locale;
import java.text.NumberFormat;

public class KaryawanService {
    public void getInfoKaryawan(Karyawan k) {
        System.out.printf("""
                Nama        : %s
                Umur        : %d
                Gaji        : %d
                Perusahaan  : %s
                
                """, k.nama, k.umur, k.gaji, Karyawan.perusahaan);
    }
}