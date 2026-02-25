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
                case 1 :
                    System.out.printf("hasil dari %d + %d = %d".formatted(x, y, (x + y)));
                    break;
                case 2 :
                    System.out.printf("hasil dari %d - %d = %d".formatted(x, y, (x - y)));
                    break;
                case 3 :
                    System.out.printf("hasil dari %d × %d = %d".formatted(x, y, (x * y)));
                    break;
                case 4 :
                    System.out.printf("hasil dari %d ÷ %d = %d".formatted(x, y, (x / y)));
                    break;
                default:
                    System.out.println("tidak ada menu dengan nomor %d, pilih menu yang valid!".formatted(menu));
            }
        }
    }

    public static void soalKetiga(int jum_siswa, Scanner input) {
        int[] nilai_tiap_siswa = new int[jum_siswa];

        int total_nilai = 0;

        for (int i = 0; i < jum_siswa; i++) {
            System.out.print("masukan nilai mahasiswa ke - %f : ");
            int nilai = input.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        soal ketiga :
        System.out.println("masukan jumlah mahasiswa : ");
        int jum_mahasiswa = input.nextInt();

        soalKetiga(jum_mahasiswa, input);
    }
}