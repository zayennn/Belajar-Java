import java.util.Scanner;

public class Main {
    public static void mahasiswa(int mhs, int nilai) {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah mahasiswa : ");
        int jumlah_siswa = input.nextInt();

        int[] nilai = new int[jumlah_siswa];

        for (int i = 0; i < jumlah_siswa; i++) {
            System.out.println("");
        }

        System.out.println(nilai[0]);
    }
}