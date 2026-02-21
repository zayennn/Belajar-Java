import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nama kamu: ");
        String nama = input.nextLine();

        System.out.println("halo " + nama);
    }
}

// import java.util.Scanner; : import library Scanner

// Scanner input = new Scanner(System.in); :
// • bikin object scanner
// • baca dari keyboard (System.in)

