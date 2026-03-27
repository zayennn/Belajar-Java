package service;

import model.Karyawan;

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