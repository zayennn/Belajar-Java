public class Main{
    static class Mahasiswa{
        private String nama;
        private int umur;

        Mahasiswa(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

        public String tampilkanNama() {
            return nama;
        }

        public int tampilkanUmur() {
            return umur;
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("capytanic", 12);
        System.out.printf("halo %s, umur kamu %d tahun", mhs1.tampilkanNama(), mhs1.tampilkanUmur());
    }
}