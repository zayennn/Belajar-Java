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

        int getRataRata(int total, int jum) {
            int rata_rata = total / jum;

            return rata_rata;
        }

        void getInfo() {
            System.out.printf("""
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
        System.out.println("");

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.printf("Masukan nama mahasiswa ke - %d  : ", i + 1);
            String nama = input.nextLine();
            System.out.print("Masukan nim mahasiswa          : ");
            int nim = input.nextInt();
            input.nextLine();
            System.out.print("Masukan nilai mahasiswa        : ");
            int nilai = input.nextInt();
            input.nextLine();

            System.out.println("");

            mahasiswas.add(new Mahasiswa(nama, nim, nilai));
        }

        int total = 0;

        System.out.println("============== Mahasiswa ==============");
        for (Mahasiswa mhs : mahasiswas) {
            mhs.getInfo();
            total += mhs.nilai;
            mhs.getRataRata(total, jum_mahasiswa);
        }
    }
}