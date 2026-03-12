import jdk.dynalink.StandardNamespace;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static class Mahasiswa {
        String nama;
        int nim;
        int nilai;

        Mahasiswa(String nama, int nim, int nilai) {
            this.nama = nama;
            this.nim = nim;
            this.nilai = nilai;
        }

        void getInfo() {
            System.out.printf("""
                    Nama    : %s
                    Nim     : %d
                    Nilai   : %d
                    
                    """, nama, nim, nilai);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        int total_nilai = 0;

        System.out.print("Masukan jumlah mahasiswa : ");
        int jumlah_mahasiswa = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.printf("Masukan nama mahasiswa ke - %d : ", i + 1);
            String nama = input.nextLine();

            System.out.printf("Masukan nim mahasiswa : ");
            int nim = input.nextInt();
            input.nextLine();

            System.out.printf("Masukan nilai mahasiswa : ");
            int nilai = input.nextInt();
            input.nextLine();

            mahasiswas.addAll(Arrays.asList(
                    new Mahasiswa(nama, nim, nilai)
            ));
        }

        for (Mahasiswa mhs : mahasiswas) {
            total_nilai += mhs.nilai;
        }

        int nilai_rata_rata = total_nilai / jumlah_mahasiswa;

        System.out.println("==================== Daftar Mahasiswa ====================");
        for (Mahasiswa mhs : mahasiswas) {
            total_nilai += mhs.nilai;

            mhs.getInfo();
            System.out.println("Rata rata nilai mahasiswa : " + nilai_rata_rata);
        }
    }
}