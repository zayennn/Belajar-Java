package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();
        KaryawanService service = new KaryawanService();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("""
                    ================== Sistem Manajemen Karyawan ==================
                    1. Tambah karyawan
                    2. Hapus karyawan
                    3. Tampilkan semua karyawan
                    4. Cari karyawan berdasarkan nama
                    5. Sorting (gaji/umur)
                    6. Filter (gaji > sekian)
                    7. Keluar
                    """);

            System.out.print("Pilih opsi anda (1/2/3/4/5/6/7) : ");
            int menu = input.nextInt();
            input.nextLine();
        }
    }
}