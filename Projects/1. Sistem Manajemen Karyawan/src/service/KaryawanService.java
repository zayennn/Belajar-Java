package service;

import model.Karyawan;

public class KaryawanService {
    void getInfoKaryawan(Karyawan k) {
        System.out.printf("""
                Nama    : %s
                Umur    : %d
                Gaji    : %d
                """, k.nama, k.umur, k.gaji);
    }
}