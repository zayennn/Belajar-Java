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

    abstract int getHitungTotal(int hari);

    abstract String getInfo(int hari);
}

class Mobil extends Kendaraan {
    int jumlah_pintu;

    Mobil(String merk, int hargaSewaPerHari, int jumlah_pintu) {
        super(merk, hargaSewaPerHari);
        this.jumlah_pintu = jumlah_pintu;
    }

    @Override
    int getHitungTotal(int hari) {
        return hargaSewaPerHari * hari;
    }

    @Override
    String getInfo(int hari) {
        int total = hargaSewaPerHari * hari;
        return String.format("""

Merk Mobil          : %s
Jumlah Pintu Mobil  : %d
Harga Sewa Per Hari : %s -
Disewa Selama       : %d hari
———————————————————————————————————— ×
Total               : %s -
                
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
    int getHitungTotal(int hari) {
        return hargaSewaPerHari * hari;
    }

    @Override
    String getInfo(int hari) {
        int total = hargaSewaPerHari * hari;
        return String.format("""
Merk Motor          : %s
Tipe Helm           : %s
Harga Sewa Per Hari : %s -
Disewa Selama       : %d hari
———————————————————————————————————— ×
Total               : %s -
                
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
        int total_bayar = 0;

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
                        break;
                    case 2 :
                        System.out.print("masukan berapa lama anda ingin menyewa mobil / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_mobil = new Mobil("Lamborghini Aventador", 10000000, 2);
                        daftar[i] = sewa_mobil;
                        break;
                    case 3 :
                        System.out.print("masukan berapa lama anda ingin menyewa mobil / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_mobil = new Mobil("BMW 3 Series", 2000000, 4);
                        daftar[i] = sewa_mobil;
                        break;
                }
            } else if (menu_user.equals("motor")) {
                System.out.print("""
# Motor :
1. Merk Motoe = Kawasaki Ninja H2R         |   Rp 1.000.000  / hari   |  Tipe Helm : Anak Sunmori
2. Merk Motoe = BMW S1KRR                  |   Rp 2.439.999  / hari   |  Tipe Helm : Anak Sunmori
3. Merk Motoe = Ducati V4S Superlegerra    |   Rp 3.499.999  / hari   |  Tipe Helm : Anak Sunmori
                        """);

                Motor sewa_motor;

                System.out.print("pilih motor menggunakan menu (1/2/3) : ");
                int menu = input.nextInt();

                switch (menu) {
                    case 1 :
                        System.out.print("masukan berapa lama anda ingin menyewa motor / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_motor = new Motor("Kawasaki Ninja H2R", 1000000, "Anak Sunmori");
                        daftar[i] = sewa_motor;
                        break;
                    case 2 :
                        System.out.print("masukan berapa lama anda ingin menyewa motor / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_motor = new Motor("BMW S1KRR", 2349999, "Anak Sunmori");
                        daftar[i] = sewa_motor;
                        break;
                    case 3 :
                        System.out.print("masukan berapa lama anda ingin menyewa motor / hari : ");
                        hari[i] = input.nextInt();
                        input.nextLine();

                        sewa_motor = new Motor("Ducati V4S Superlegerra", 3499999, "Anak Sunmori");
                        daftar[i] = sewa_motor;
                        break;
                }
            } else {
                throw new IllegalArgumentException("tidak ada kendaraan yang anda maksud");
            }

            total_bayar += daftar[i].getHitungTotal(hari[i]);
        }

        int counter = 0;
        for (Kendaraan kendaraan : daftar) {
            System.out.println(kendaraan.getInfo(hari[counter]));
            counter++;
        }

        System.out.println("Total yang harus anda bayar adalah : " + Kendaraan.formatRupiah.format(total_bayar) + " -");
    }
}