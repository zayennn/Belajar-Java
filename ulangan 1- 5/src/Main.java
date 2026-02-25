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

        int jumlah_mahasiswa_diatas_rata_rata = 0;

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

            total_nilai += nilai_tiap_siswa[i];

        }

        double nilai_rata_rata = total_nilai / nilai_tiap_siswa.length;

        for (int i = 0; i < nilai_tiap_siswa.length; i++) {
            if (nilai_tiap_siswa[i] > nilai_rata_rata) {
                jumlah_mahasiswa_diatas_rata_rata++;
            }
        }

        System.out.printf("""
                
                nilai tertinggi mahasiswa               : %.2f
                nilai terkecil mahasiswa                : %.2f
                rata rata nilai tiap mahasiswa          : %.2f
                jumlah mahasiswa nilai ditas rata-rata  : %d
                """.formatted(nilai_tertinggi, nilai_terkecil, nilai_rata_rata, jumlah_mahasiswa_diatas_rata_rata));
    }

    public static void soalKeempat(int com, Scanner input) {
        int kesempatan_user = 5;

        System.out.println("tebak angka dari 1 - 100");

        while (kesempatan_user > 0) {
            System.out.print("\nmasukan tebakan kamu 1-100 : ");
            int tebakan_user = input.nextInt();

            if (tebakan_user != com) {
                kesempatan_user--;
                System.out.println("tebakan mu salah, sisa kesempatanmu tersisa : " + kesempatan_user);

                if (tebakan_user >= com) {
                    System.out.println("pilihan mu terlalu besar");
                } else {
                    System.out.println("pilihanmu terlalu kecil");
                }

                if (kesempatan_user == 0) {
                    System.out.println("kesempatanmu sudah habis");
                    System.out.println("jawaban yang benar adalah : " + com);
                }

            } else {
                System.out.println("selamat tebakanmu benar");
                System.out.println("sisa kesempatan mu : " + kesempatan_user);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        soal pertama :
        System.out.print("masukan nama anda : ");
        String nama = input.nextLine();

        System.out.print("masukan umur anda : ");
        int umur = input.nextInt();

        System.out.print("masukan tinggi anda : ");
        double tinggi = input.nextDouble();

        soalPertama(nama, umur, tinggi);

//        soal kedua :
        soalKedua(input);

//        soal ketiga :
        System.out.print("masukan jumlah mahasiswa : ");
        int jum_mahasiswa = input.nextInt();

        soalKetiga(jum_mahasiswa, input);

//        soal keempat :
        int com = (int) (Math.random() * 10) + 1;

        soalKeempat(com, input);
    }
}