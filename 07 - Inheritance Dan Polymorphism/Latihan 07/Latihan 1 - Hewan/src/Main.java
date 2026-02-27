public class Main{
    static class Hewan{
        String nama;

        Hewan(String nama) {
            this.nama = nama;
        }

        void getSuara() {
            System.out.println("suara hewan normal");
        }
    }

    static class Kucing extends Hewan {
        Kucing(String nama) {
            super(nama);
        }
        @Override
        void getSuara() {
            System.out.println("miaw");
        }
    }

    static class Anjing extends Hewan {
        Anjing(String nama) {
            super(nama);
        }
        @Override
        void getSuara() {
            System.out.println("guk guk");
        }
    }

    public static void main(String[] args) {
        Hewan[] hewans = new Hewan[2];

        Hewan kucing = new Kucing("mochiaw");
        Hewan anjing = new Anjing("bob");

        hewans[0] = kucing;
        hewans[1] = anjing;

        for (Hewan hwn : hewans) {
            hwn.getSuara();
        }
    }
}