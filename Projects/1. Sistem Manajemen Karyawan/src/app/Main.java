package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();

        karyawans.addAll(java.util.Arrays.asList(
                new Karyawan("karyawan 1", 20, 1000000),
                new Karyawan("karyawan 2", 19, 3000000),
                new Karyawan("karyawan 3", 30, 2000000)
        ));

        while(true) {
            System.out.println("""
                    ============================ Sistem Manajemen Karyawan ============================
                    1. Tambah Karyawan
                    2. Hapus Karyawan
                    3. Tampilan Semua Karyawan
                    4. Cari Karyawan Berdasarkan Nama
                    """)
        }
    }
}