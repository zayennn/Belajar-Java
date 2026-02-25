public class Main{
    class Mobil {
        private String nama;
        private int tahun;
        private String warna;

        String infoMobil() {
            return String.format("""
nama mobil : %s
keluaran tahun : %d
warna mobil : %s
                    """, nama, tahun, warna);
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Mobil mobil1 = mainObj.new Mobil();

        mobil1.nama = "bmw";
        mobil1.tahun = 2026;
        mobil1.warna = "hitam";

        Mobil mobil2 = mainObj.new Mobil();

        mobil2.nama = "lamborghini";
        mobil2.tahun = 2025;
        mobil2.warna = "merah";

        System.out.println(mobil1.infoMobil());
        System.out.println(mobil2.infoMobil());
    }
}