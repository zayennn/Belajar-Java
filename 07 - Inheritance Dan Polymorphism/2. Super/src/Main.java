public class Main{
    static class Kendaraan {
        String merk;
        String warna;

        Kendaraan(String merk, String warna) {
            this.merk = merk;
            this.warna = warna;
        }

        void getInfo() {
            System.out.println("merk : " + merk);
        }
    }

    static class Mobil extends Kendaraan {
        int pintu;

        Mobil(String merk, String warna, int pintu) {
            super(merk, warna);
        }
    }
}