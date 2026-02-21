import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan umur kamu");
        int umur = input.nextInt();

        if ( umur >= 19 ) {
            System.out.print("Dewasa");
        } else {
            System.out.print("Remaja");
        }
    }
}