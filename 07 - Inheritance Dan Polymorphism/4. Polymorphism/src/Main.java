public class Main{
    static class Kendaraan{
        void suara(){
            System.out.println("suara umum");
        }
    }

    static class Mobil extends Kendaraan {
        void suara(){
            System.out.println("bruum");
        }
    }

    static class Motor extends Kendaraan {
        void suara(){
            System.out.println("ngengggg");
        }
    }

    public static void main(String[] args) {
        Kendaraan[] daftar = {
                new Mobil(),
                new Motor()
        };

        for (Kendaraan k : daftar) {
            k.suara();
        }
    }
}