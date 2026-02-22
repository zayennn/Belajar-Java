import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah mahasiswa : ");
        int jumlah_siswa = input.nextInt();

        int[] nilai = new int[jumlah_siswa];
        int max = 0;
        int min = 100;

        for (int i = 0; i < jumlah_siswa; i++) {
            System.out.println("masukan nilai mahasiswa ke - " + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        for (int i = 0; i < jumlah_siswa; i++) {
            System.out.printf("mahasiswa ke - %d mempunyai nilai = %d\n", i + 1, nilai[i]);

            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("\nnilai terbesar : " + max);
        System.out.println("nilai terkecil : " + min);
    }
}