import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah data : ");
        int datas = input.nextInt();

        int[] arr = new int[datas];

        for (int i = 0; i < datas; i++) {
            System.out.println("masukan angka ke - " + i + " : ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < datas; i++) {
            System.out.println(arr[i]);
        }

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println();
        System.out.println(total);
    }
}