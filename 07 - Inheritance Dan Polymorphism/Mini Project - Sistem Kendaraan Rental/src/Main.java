import jdk.dynalink.StandardNamespace;

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

abstract class Kendaraan {
    String merk;
    int hargaSewaPerHari;

    static final Locale indonesia = new Locale("id", "ID");
    static final NumberFormat formatRupiah;

    static {
        formatRupiah = NumberFormat.getCurrencyInstance(indonesia);
        formatRupiah.setMaximumFractionDigits(0);
        formatRupiah.setMinimumFractionDigits(0);
    }

    Kendaraan(String merk, int hargaSewaPerHari) {
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    abstract void getHargaSewaPerHari(int hari);
}

class Mobil extends Kendaraan {
    int jumlah_pintu;

    Mobil(String merk, int hargaSewaPerHari, int jumlah_pintu) {
        super(merk, hargaSewaPerHari);
        this.jumlah_pintu = jumlah_pintu;
    }

    @Override
    void getHargaSewaPerHari(int hari) {
        System.out.printf("""
                merk mobil          : %s
                jumlah pintu mobil  : %d
                harga sewa per hari : %s
                disewa selama       : %d hari
                ———————————————————————————————————— ×
                total bayar         : %s
                
                """, merk, jumlah_pintu, formatRupiah.format(hargaSewaPerHari), hari, formatRupiah.format((hargaSewaPerHari * hari)));
    }
}

class Motor extends Kendaraan {
    String tipe_helm;

    Motor(String merk, int hargaSewaPerHari, String tipe_helm) {
        super(merk, hargaSewaPerHari);
        this.tipe_helm = tipe_helm;
    }

    @Override
    void getHargaSewaPerHari(int hari) {
        System.out.printf("""
                merk motor          : %s
                tipe helm           : %s
                harga sewa per hari : %s
                disewa selama       : %d hari
                ———————————————————————————————————— ×
                total bayar         : %s
                
                """, merk, tipe_helm, formatRupiah.format(hargaSewaPerHari), hari, formatRupiah.format((hargaSewaPerHari * hari)));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah peminjaman : ");
        int jumlah_peminjaman = input.nextInt();

        Kendaraan[] daftar = new Kendaraan[jumlah_peminjaman];

        System.out.print("pilih kendaraan yang ingin anda sewa (motor/mobil) : ");
        String menu_user = input.nextLine();

        System.out.println(menu_user);

    }
}