package model;

public class Karyawan {
    private String nama;
    private int umur;
    private int gaji;
    private static String perusahaan;

    Karyawan(String nama, int umur, int gaji, String perusahaan) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
        this.perusahaan = perusahaan;
    }
}