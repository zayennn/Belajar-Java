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
    }
}