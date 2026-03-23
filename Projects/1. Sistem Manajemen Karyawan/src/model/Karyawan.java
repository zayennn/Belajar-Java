package model;

import java.util.Collections;

public class Karyawan implements Comparable<Karyawan> {
    public String nama;
    public int umur;
    public int gaji;

    public Karyawan(String nama, int umur, int gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

    @Override
    public int compareTo(Karyawan other) {
        return other.gaji - this.gaji;
    }
}
