import java.util.Scanner;

public class Main {
    public static void latihan1() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan banyak angka yang ingin di cetak : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}