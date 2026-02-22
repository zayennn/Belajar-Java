import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Latihan 1 — tampilkan semua isi array
        int[] arr = {5, 10, 15, 20, 25};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        Latihan 2 — jumlah semua isi array
//        int total = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            total += arr[i];
//        }
//
//        System.out.println(total);

//        Latihan 3 — cari nilai terbesar
        int[] arr2 = {3, 9, 2, 15, 7};
//        int max = arr2[0];
//
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] >= max) {
//                max = arr2[i];
//            }
//        }
//
//        System.out.println(max);

//        Latihan 4 — rata-rata nilai
        int[] nilai_mahasiswa = {80, 70, 90, 60};
        int total4 = 0;
        int jum_data = 0;

        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            total4 += nilai_mahasiswa[i];
        }

        for (int i = 0; i <= nilai_mahasiswa.length; i++) {
            jum_data = i;
        }

        int rata_rata_nilai = total4 / jum_data;

        System.out.println(rata_rata_nilai);

    }
}