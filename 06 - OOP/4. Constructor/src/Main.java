public class Main {
    static class Mahasiswa{
        String nama;
        int umur;

        Mahasiswa(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;

//            this.nama/umur → field class
//            = nama/umur → parameter constructor
        }

        void tampilkan() {
            System.out.printf("halo %s, umur kamu %d", nama, umur);
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("capyking", 19);

        mhs1.tampilkan();
    }
}