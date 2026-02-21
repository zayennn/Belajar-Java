import java.util.Scanner;

public class Main {
    public static void tambah(int x, int y) {
        System.out.printf("hasil dari %d + %d adalah = %d\n", x, y, x + y);
    }
    public static void kali(int x, int y) {
        System.out.printf("hasil dari %d × %d adalah = %d\n", x, y, x * y);
    }
    public static void bagi(int x, int y) {
        System.out.printf("hasil dari %d : %d adalah = %d\n", x, y, x / y);
    }
    public static void kurang(int x, int y) {
        System.out.printf("hasil dari %d - %d adalah = %d\n", x, y, x - y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka pertama : ");
        int x = input.nextInt();

        System.out.print("masukan angka kedua : ");
        int y = input.nextInt();

        tambah(x, y);
        kali(x, y);
        bagi(x, y);
        kurang(x, y);

        input.close();
    }
}