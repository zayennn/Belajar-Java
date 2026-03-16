// latihan 2
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static class Mahasiswa {
        String nama;
        int nilai;

        Mahasiswa(String nama, int nilai) {
            this.nama = nama;
            this.nilai = nilai;
        }

        void tampil() {
            System.out.println("Nama : " + nama + " | " + "Nilai : " + nilai);
        }
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        mahasiswas.addAll(Arrays.asList(
                new Mahasiswa("mhs 1", 87),
                new Mahasiswa("mhs 2", 89),
                new Mahasiswa("mhs 3", 86)
        ));

        mahasiswas.forEach(Mahasiswa::tampil);
    }
}