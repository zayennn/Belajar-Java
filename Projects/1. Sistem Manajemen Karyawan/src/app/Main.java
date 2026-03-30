package app;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.print("""
                    ===================== Sistem Manajemen Karyawan =====================
                    1. Tambah karyawan
                    2. Hapus karyawan
                    3. Tampilkan semua karyawan
                    4. Cari karyawan berdasarkan nama
                    5. Sorting (gaji / umur)
                    6. Filter (gaji > sekian)
                    7. Keluar
                    """);
        }
    }
}