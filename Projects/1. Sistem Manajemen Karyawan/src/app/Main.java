package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                    5. Sorting ( gaji / umur )
                    6. Filter ( gaji > / < Sekian )
                    7. Keluar
                    """);

            System.out.print("Masukan menu pilihan anda (1/2/3/4/5/6/7) : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 :
                    System.out.print("Masukan nama karyawan : ");
                    String nama = input.nextLine();

                    System.out.print("Masukan umur karyawan : ");
                    int umur = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukan gaji karyawan : ");
                    int gaji = input.nextInt();
                    input.nextLine();

                    karyawans.add(new Karyawan(nama, umur, gaji));

                    System.out.println("Karyawan Berhasil Ditambahkan!");
                    break;

                case 3 :
                    for (Karyawan k : karyawans) {
                        KaryawanService.getInfoKaryawan(k);
                    }
                    break;

                case 4 :
                    System.out.print("Cari nama karyawan yang ingin anda cari : ");
                    String keyword = input.nextLine();

                    Karyawan hasil = KaryawanService.cariNama(karyawans, keyword);

                    if (hasil != null) {
                        System.out.println("Ditemukan :");
                        KaryawanService.getInfoKaryawan(hasil);
                    }

                case 7 :
                    System.out.println("Terimakasih...");
                    return;

                default :
                    throw new IllegalArgumentException("Mohon pilih menu yang valid");
            }
        }
    }
}