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

        mahasiswas.addAll(Arrays.asList(
                new Mahasiswa("mhs1", 15250506, 100),
                new Mahasiswa("mhs2", 15250507, 90),
                new Mahasiswa("mhs3", 15250508, 80),
                new Mahasiswa("mhs4", 15250509, 70)
        ));

        for (Mahasiswa mhs : mahasiswas) {
            mhs.getInfo();
        }
    }
}