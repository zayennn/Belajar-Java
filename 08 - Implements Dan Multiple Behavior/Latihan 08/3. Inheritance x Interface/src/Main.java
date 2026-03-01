class Vehicle{
    String merk;

    Vehicle(String merk) {
        this.merk = merk;
    }

    void jalan() {
        System.out.println("jalan");
    }
}

interface Electric {
    double isiDaya(double jumlah_isi);
    double getCekBatre();
}

class Tesla extends Vehicle implements Electric {
    double batre_sekarang;
    final private double kapasitas_batre = 100;
    final private double konsumsi_batre_per_km = 0.2;
    final private int harga_listrik_per_kwh = 1500;

    Tesla(String merk, double batre_sekarang) {
        super(merk);
        this.batre_sekarang = batre_sekarang;
    }

    public double isiDaya(double jumlah_isi) {
        batre_sekarang += jumlah_isi;

        if (batre_sekarang > kapasitas_batre) {
            batre_sekarang = kapasitas_batre;
        }

        return batre_sekarang;
    }

    public double getCekBatre() {
        return batre_sekarang;
    }

    double hitungBiayaListrik(int jarak) {
        double energi_dipakai = jarak * konsumsi_batre_per_km;
        double biaya = energi_dipakai * harga_listrik_per_kwh;

        return biaya;
    }
}

public class Main{
    public static void main(String[] args) {
        Tesla t = new Tesla("Tesla", 57);
        System.out.println(t.getCekBatre());
    }
}