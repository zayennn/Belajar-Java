import java.util.Scanner;

public class Main {
    public static void soalPertama(String nama, int umur, double tinggi) {
        String status = umur > 18 ? "dewasa" : "remaja";
        System.out.printf("""
                
                ========= biodata =========
                nama         : %s
                umur         : %d
                tinngi badan : %.1f cm
                status       : %s
                """.formatted(nama, umur, tinggi, status));
    }

    public static void soalKedua(Scanner input) {
        while (true) {
            System.out.println("""
                    
                    ========= menu kalkulator =========
                    1. tambah
                    2. kurang
                    3. perkalian
                    4. pembagian
                    5. keluar
                    """);

            System.out.print("pilih menu (1/2/3/4/5) : ");
            int menu = input.nextInt();

            if (menu == 5) {
                System.out.println("terimakasih^^");
                break;
            }

            System.out.print("masukan angka pertama : ");
            int x = input.nextInt();

            System.out.print("masukan angka kedua : ");
            int y = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.printf("hasil dari %d + %d = %d".formatted(x, y, (x + y)));
                    break;
                case 2:
                    System.out.printf("hasil dari %d - %d = %d".formatted(x, y, (x - y)));
                    break;
                case 3:
                    System.out.printf("hasil dari %d × %d = %d".formatted(x, y, (x * y)));
                    break;
                case 4:
                    System.out.printf("hasil dari %d ÷ %d = %d".formatted(x, y, (x / y)));
                    break;
                default:
                    System.out.println("tidak ada menu dengan nomor %d, pilih menu yang valid!".formatted(menu));
            }
        }
    }

    public static void soalKetiga(int jum_siswa, Scanner input) {
        int[] nilai_tiap_siswa = new int[jum_siswa];

        double total_nilai = 0;
        double nilai_tertinggi = Integer.MIN_VALUE;
        double nilai_terkecil = Integer.MAX_VALUE;


        for (int i = 0; i < jum_siswa; i++) {
            System.out.printf("masukan nilai mahasiswa ke - %d : ", (i + 1));
            int nilai = input.nextInt();

            nilai_tiap_siswa[i] = nilai;

            if (nilai_tiap_siswa[i] > nilai_tertinggi) {
                nilai_tertinggi = nilai_tiap_siswa[i];
            }

            if (nilai_tiap_siswa[i] < nilai_terkecil) {
                nilai_terkecil = nilai_tiap_siswa[i];
            }
        }

        System.out.println("");

        System.out.println("nilai tertinggi = " + nilai_tertinggi);
        System.out.println("nilai terkecil = " + nilai_terkecil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        soal ketiga :
        System.out.print("masukan jumlah mahasiswa : ");
        int jum_mahasiswa = input.nextInt();

        soalKetiga(jum_mahasiswa, input);
    }
}