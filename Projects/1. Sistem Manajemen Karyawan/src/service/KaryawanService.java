package service;

import model.Karyawan;
import java.util.Locale;
import

public class KaryawanService {
    public static void getInfoKaryawan(Karyawan karyawan) {
        System.out.printf("""
                Nama    : %s
                Umur    : %d
                Gaji    : %d
                """, karyawan.nama, karyawan.umur, karyawan.gaji);
    }
}
