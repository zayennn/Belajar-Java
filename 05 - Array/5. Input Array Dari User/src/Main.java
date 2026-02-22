import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input jumlah data : ");
        int n = input.nextInt();

        int[] datas = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("masukan angka ke - " + i + " : ");
            datas[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(datas[i]);
        }
    }
}