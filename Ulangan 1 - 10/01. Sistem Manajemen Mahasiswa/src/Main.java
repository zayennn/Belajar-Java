import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
                    ============== Mahasiswa ==============
                    NAMA    : %s
                    NIM     : %d
                    NILAI   : %d
                    
                    """, nama, nim, nilai);
        }
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        System.out.print("Masukan jumlah mahasiswa : ");
        int jum_mahasiswa = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.print("Masukan nama mahasiswa  : ");
            String nama = input.nextLine();
            System.out.print("Masukan nim mahasiswa   : ");
            int nim = input.nextInt();
            System.out.print("Masukan nilai mahasiswa : ");
            int nilai = input.nextInt();

            mahasiswas.add(new Mahasiswa(nama, nim, nilai));
        }


    }
}