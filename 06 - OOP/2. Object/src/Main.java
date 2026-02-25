// File utama
public class Main {

    /*
     * Ini namanya Static Nested Class
     * Kenapa static?
     * Karena method main itu static.
     * Jadi kalau class Mahasiswa tidak static,
     * dia tidak bisa langsung dibuat object-nya di dalam main.
     * Static artinya class ini milik Main,
     * bukan milik object dari Main.
     */
    static class Mahasiswa {

        // Ini field / atribut
        // Field ini milik setiap object Mahasiswa
        String nama;
        int umur;

        /*
         * Ini contoh method non-static
         * Method ini milik object Mahasiswa
         */
        void tampilkanData() {
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
        }
    }

    /*
     * Method main adalah titik awal program.
     * Harus static karena Java menjalankan ini
     * tanpa membuat object Main dulu.
     */
    public static void main(String[] args) {

        /*
         * Membuat object dari class Mahasiswa
         * new Mahasiswa() artinya membuat instance baru
         */
        Mahasiswa m1 = new Mahasiswa();

        // Mengisi nilai field
        m1.nama = "Elang";
        m1.umur = 19;

        // Mengakses field langsung
        System.out.println(m1.nama);
        System.out.println(m1.umur);

        System.out.println("------------");

        // Memanggil method milik object
        m1.tampilkanData();

        /*
         * Contoh object kedua
         * Supaya lo lihat tiap object punya data sendiri
         */
        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Budi";
        m2.umur = 21;

        System.out.println("------------");
        m2.tampilkanData();
    }
}