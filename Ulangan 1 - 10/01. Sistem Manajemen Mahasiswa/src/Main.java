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
                    ============== Mahasiswa ==============
                    NAMA    : %s
                    NIM     : %d
                    NILAI   : %d

                    """, nama, nim, nilai);
        }
    }

    ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();


}