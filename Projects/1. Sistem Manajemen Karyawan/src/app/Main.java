package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();
        KaryawanService service = new KaryawanService();

        while(true) {
            System.out.println("""
                    ================== Sistem Manajemen Karyawan ==================
                    1. Tambah karyawan
                    2. Hapus karyawan
                    3. Tampilkan semua karyawan
                    4. Cari karyawan berdasarkan nama
                    
                    """);
        }
    }
}