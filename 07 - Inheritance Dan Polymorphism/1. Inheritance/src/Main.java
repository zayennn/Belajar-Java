public class Main {

    // Ini class dasar / induk.
    // Semua kendaraan minimal punya merk.
    // Jadi kita taro di parent biar gak nulis ulang di class lain.
    static class Kendaraan {

        String merk; // properti dasar yang pasti dimiliki kendaraan

        void info() {
            // method ini buat nampilin info dasar kendaraan
            System.out.println("merek : " + merk);
        }
    }

    // Mobil itu turunan dari Kendaraan
    // Artinya Mobil otomatis punya semua isi Kendaraan (merk + method info())
    static class Mobil extends Kendaraan {

        int jumlahPintu;
        // properti tambahan yang cuma dimiliki Mobil
        // Kendaraan umum gak harus punya pintu


        void info() {
            System.out.println("jumlah pintu : " + jumlahPintu);
        }
    }


    //    contoh pemakain :
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "bmw";
        mobil1.jumlahPintu = 2;
        mobil1.info();
    }
}