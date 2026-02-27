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

    abstract String getHargaSewaPerHari(int hari);
}

class Mobil extends Kendaraan {
    int jumlah_pintu;

    Mobil(String merk, int hargaSewaPerHari, int jumlah_pintu) {
        super(merk, hargaSewaPerHari);
        this.jumlah_pintu = jumlah_pintu;
    }

    @Override
    String getHargaSewaPerHari(int hari) {
        int total = hargaSewaPerHari * hari;
        return String.format("""

merk mobil          : %s
jumlah pintu mobil  : %d
harga sewa per hari : %s -
disewa selama       : %d hari
———————————————————————————————————— ×
total               : %s -
                
                """, merk, jumlah_pintu, formatRupiah.format(hargaSewaPerHari), hari, formatRupiah.format(total));
    }
}

class Motor extends Kendaraan {
    String tipe_helm;

    Motor(String merk, int hargaSewaPerHari, String tipe_helm) {
        super(merk, hargaSewaPerHari);
        this.tipe_helm = tipe_helm;
    }

    @Override
    String getHargaSewaPerHari(int hari) {
        int total = hargaSewaPerHari * hari;
        return String.format("""
merk mobil          : %s
tipe helm           : %s
harga sewa per hari : %s -
disewa selama       : %d hari
———————————————————————————————————— ×
total               : %s -
                
                """, merk, tipe_helm, formatRupiah.format(hargaSewaPerHari), hari, formatRupiah.format(total));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah peminjaman : ");
        int jumlah_peminjaman = input.nextInt();
        input.nextLine();

        Kendaraan[] daftar = new Kendaraan[jumlah_peminjaman];
        int[] hari = new int[jumlah_peminjaman];

        for (int i = 0; i < jumlah_peminjaman; i++) {
            System.out.print("pilih kendaraan yang ingin anda sewa (mobil/motor) : ");
            String menu_user = input.nextLine().toLowerCase();

            if (menu_user.equals("mobil")) {
                System.out.print("""
================= Menu Peminjaman =================
# Mobil :
1. Merk Mobil = BMW M4                     |   Rp 3.000.000  / hari   |  2 pintu
2. Merk Mobil = Lamborghini Aventador      |   Rp 10.000.000 / hari   |  2 pintu
3. Merk Mobil = BMW 3 Series               |   Rp 2.000.000  / hari   |  4 pintu

                """);

                Mobil sewa_mobil;

                System.out.print("pilih mobil menggunakan menu (1/2/3) : ");
                int menu = input.nextInt();

                switch (menu) {
                    case 1 :
                        System.out.print("masukan berapa lama anda ingin menyewa mobil / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_mobil = new Mobil("BMW M4", 3000000, 2);
                        daftar[i] = sewa_mobil;
                    case 2 :
                        System.out.print("masukan berapa lama anda ingin menyewa mobil / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_mobil = new Mobil("Lamborghini Aventador", 10000000, 2);
                        daftar[i] = sewa_mobil;
                    case 3 :
                        System.out.print("masukan berapa lama anda ingin menyewa mobil / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_mobil = new Mobil("BMW 3 Series", 2000000, 4);
                        daftar[i] = sewa_mobil;
                }
            }
        }

        int counter = 0;
        for (Kendaraan kendaraan : daftar) {
            System.out.println(kendaraan.getHargaSewaPerHari(hari[counter]));
            counter++;
        }
    }
}