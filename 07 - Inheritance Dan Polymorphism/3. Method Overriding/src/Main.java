public class Main {
    static class Kendaraan {
        String merk;

        Kendaraan(String merk) {
            this.merk = merk;
        }

        void getInfo() {
            System.out.println("merk : " + merk);
        }
    }

    static class Mobil extends Kendaraan {
        int pintu;

        Mobil(String merk, int pintu) {
            super(merk);
            this.pintu = pintu;
        }
    }


}