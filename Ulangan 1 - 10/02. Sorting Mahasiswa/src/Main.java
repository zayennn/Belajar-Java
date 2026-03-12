import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static class Mahasiswa implements Comparable<Mahasiswa> {
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

        @Override
        public int compareTo(Mahasiswa other) {
            return other.nilai - this.nilai;
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

            System.out.print("Masukan nim mahasiswa : ");
            int nim = input.nextInt();
            input.nextLine();

            System.out.print("Masukan nilai mahasiswa : ");
            int nilai = input.nextInt();
            input.nextLine();

            mahasiswas.add(new Mahasiswa(nama, nim, nilai));
        }

        for (Mahasiswa mhs : mahasiswas) {
            total_nilai += mhs.nilai;
        }

        int nilai_rata_rata = total_nilai / jumlah_mahasiswa;

        Collections.sort(mahasiswas);

        System.out.println("==================== Daftar Mahasiswa ====================");
        for (Mahasiswa mhs : mahasiswas) {
            total_nilai += mhs.nilai;

            mhs.getInfo();

        }

        System.out.println("Rata rata nilai mahasiswa : " + nilai_rata_rata);
    }
}