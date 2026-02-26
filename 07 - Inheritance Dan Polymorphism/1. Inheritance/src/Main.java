public class Main{
    class Kendaraan{
        String merk;

        void info(){
            System.out.println("mobil merek : " + merk);
        }
    }

    class Mobil extends Kendaraan{
        int jumlahPintu;
    }
}