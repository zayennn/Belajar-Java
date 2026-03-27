package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();
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

            switch (menu) {
                case 1 :
                    System.out.print("Berapa jumlah karyawan yang ingin anda input ? : ");
                    int jumlah_input_karyawan = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < jumlah_input_karyawan; i++) {
                        System.out.println("\nInput karyawan ke - " + (i + 1));
                        System.out.print("Masukan nama karyawan : ");
                        String nama = input.nextLine();

                        System.out.print("Masukan umur karyawan : ");
                        int umur = input.nextInt();
                        input.nextLine();

                        System.out.print("Masukan gaji karwayan : ");
                        int gaji = input.nextInt();
                        input.nextLine();

                        karyawans.add(new Karyawan(nama, umur, gaji));
                    }

                    System.out.println("\nKaryawan berhasil di tambahkan!");

                    break;

                case 3 :
                    System.out.println("");
                    karyawans.forEach(KaryawanService::getInfoKaryawan);
                    break;

                case 4 :
                    System.out.print("Cari nama karyawan : ");
                    String nama = input.nextLine();

                    Karyawan hasil = KaryawanService.getNamaKaryawan(karyawans, nama);

                    if (hasil != null) {
                        System.out.println("Karyawan ditemukan!");
                        KaryawanService.getInfoKaryawan(hasil);
                    }
            }
        }
    }
}