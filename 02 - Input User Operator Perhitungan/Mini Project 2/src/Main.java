import java.util.Scanner;

public class Main {
    public static int hitungLuasPersegi(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("panjang : ");
        int panjang = input.nextInt();

        System.out.print("lebar : ");
        int lebar = input.nextInt();

        int luas = hitungLuasPersegi(panjang, lebar);

        System.out.printf("jumlah luas persegi adalah = %d", luas);

        input.close();
    }
}