import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    static void intro() {
        System.out.println("=== PROGRAM LATIHAN JAVA LEVEL 1 - 4 ===");
        System.out.print("Masukkan nama: ");
        String n = in.nextLine();
        System.out.printf("Halo %s, selamat datang.\n\n", n);
    }

    static void kalkulator() {
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Angka 1: ");
        double a = in.nextDouble();
        System.out.print("Angka 2: ");
        double b = in.nextDouble();

        System.out.printf("Tambah  : %.2f\n", a + b);
        System.out.printf("Kurang  : %.2f\n", a - b);
        System.out.printf("Kali    : %.2f\n", a * b);
        System.out.printf("Bagi    : %s\n", b != 0 ? String.format("%.2f", a / b) : "undefined");
        System.out.println();
    }

    static void penilaian() {
        System.out.println("=== KONVERSI NILAI ===");
        System.out.print("Masukkan nilai (0-100): ");
        int n = in.nextInt();

        String hasil =
                (n < 0 || n > 100) ? "tidak valid" :
                        (n >= 90) ? "A" :
                                (n >= 80) ? "B" :
                                        (n >= 70) ? "C" : "D";

        System.out.println("Grade: " + hasil + "\n");
    }

    // ===== LEVEL 4 LOOPING =====
    static void tabelPerkalian() {
        System.out.println("=== TABEL PERKALIAN ===");
        System.out.print("Angka: ");
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", n, i, n * i);

        System.out.println();
    }

    // ===== LOOP + BREAK + CONTINUE + LABEL =====
    static void tebakAngka() {
        System.out.println("=== GAME TEBAK ANGKA ===");
        int target = (int) (Math.random() * 10) + 1;
        int attempt = 0;

        gameLoop:
        while (true) {
            System.out.print("Tebak (1-10, 0 untuk keluar): ");
            int g = in.nextInt();
            attempt++;

            if (g == 0) {
                System.out.println("Keluar dari game\n");
                break;
            }

            if (g == target) {
                System.out.printf("Benar dalam %d percobaan\n\n", attempt);
                break gameLoop;
            }

            if (g > target) {
                System.out.println("Terlalu besar");
                continue;
            }

            if (g < target) {
                System.out.println("Terlalu kecil");
            }
        }
    }

    // ===== WHILE + DO WHILE DEMO =====
    static void loopDemo() {
        System.out.println("=== LOOP DEMO ===");

        int i = 1;
        while (i <= 5) {
            System.out.println("while -> " + i++);
        }

        int j = 1;
        do {
            System.out.println("do while -> " + j++);
        } while (j <= 5);

        System.out.println();
    }

    // ===== SWITCH CONTROL =====
    static void menu() {
        outer:
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Kalkulator");
            System.out.println("2. Penilaian");
            System.out.println("3. Tabel Perkalian");
            System.out.println("4. Tebak Angka");
            System.out.println("5. Demo Loop");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int pilih = in.nextInt();

            switch (pilih) {
                case 1 -> kalkulator();
                case 2 -> penilaian();
                case 3 -> tabelPerkalian();
                case 4 -> tebakAngka();
                case 5 -> loopDemo();
                case 0 -> {
                    System.out.println("Program selesai.");
                    break outer;
                }
                default -> System.out.println("Pilihan tidak valid\n");
            }
        }
    }

    public static void main(String[] args) {
        intro();
        menu();
        in.close();
    }
}