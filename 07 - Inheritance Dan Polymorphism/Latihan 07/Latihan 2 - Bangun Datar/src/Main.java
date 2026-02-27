public class Main{
    abstract static class BangunDatar{
        abstract double getHitungLuas();
    }

    static class Persegi extends BangunDatar{
        double sisi;

        Persegi(double sisi) {
            this.sisi = sisi;
        }

        @Override
        double getHitungLuas() {
            return sisi * sisi;
        }
    }

    static class Lingkaran extends BangunDatar{
        double jari_jari;

        Lingkaran(double jari_jari) {
            this.jari_jari = jari_jari;
        }

        @Override
        double getHitungLuas() {
            return Math.PI * jari_jari * jari_jari;
        }
    }

    public static void main(String[] args) {
        Persegi sisi = new Persegi(20);
        System.out.println(sisi.getHitungLuas());
    }
}