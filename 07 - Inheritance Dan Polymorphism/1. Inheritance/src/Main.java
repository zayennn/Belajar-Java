public class Main {

    // Ini class dasar / induk.
    // Semua kendaraan minimal punya merk.
    // Jadi kita taro di parent biar gak nulis ulang di class lain.
    class Kendaraan {

        String merk; // properti dasar yang pasti dimiliki kendaraan

        void info() {
            // method ini buat nampilin info dasar kendaraan
            System.out.println("mobil merek : " + merk);
        }
    }

    // Mobil itu turunan dari Kendaraan
    // Artinya Mobil otomatis punya semua isi Kendaraan (merk + method info())
    class Mobil extends Kendaraan {

        int jumlahPintu;
        // properti tambahan yang cuma dimiliki Mobil
        // Kendaraan umum gak harus punya pintu
    }
}