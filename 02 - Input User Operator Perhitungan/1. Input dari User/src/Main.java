import java.util.Scanner;

public class Main {
    public static String latihan(String nama, int umur) {
        return String.format("halo %s, umur kamu %d", nama, umur);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nama kamu: ");
        String nama = input.nextLine();

        System.out.print("masukan umur kamu: ");
        int umur = input.nextInt();

        String mahasiswa = latihan(nama, umur);

        System.out.print(mahasiswa);
    }
}

// import java.util.Scanner; : import library Scanner

// Scanner input = new Scanner(System.in); :
// • bikin object scanner
// • baca dari keyboard (System.in)

// String nama = input.nextLine(); : ambil input teks 1 baris penuh

// Jenis input scanner:
//  | Method        | Fungsi             |
//  | ------------- | ------------------ |
//  | nextLine()    | baca teks          |
//  | nextInt()     | baca angka bulat   |
//  | nextDouble()  | baca angka desimal |
//  | nextBoolean() | true / false       |
