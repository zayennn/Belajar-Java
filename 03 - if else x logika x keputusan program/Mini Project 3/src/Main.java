import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan total jumlah belanjaan : Rp ");
        double total_belanja = input.nextDouble();
        double diskon = 0;

        if (total_belanja >= 500000) {
            diskon = total_belanja * 0.2;
        } else if (total_belanja >= 200000) {
            diskon = total_belanja * 0.1;
        } else {
            diskon = 0;
        }

        System.out.printf("total belanja = Rp %.2f\n", total_belanja);
        System.out.printf("diskon = Rp %.2f -\n", diskon);
        System.out.printf("total bayar = Rp %.2f\n", total_belanja - diskon);

        input.close();
    }
}