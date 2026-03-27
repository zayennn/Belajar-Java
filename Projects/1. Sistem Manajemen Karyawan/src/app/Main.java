package app;

import model.Karyawan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();

        karyawans.add(new Karyawan("karyawan 1", 20, 1000000));
        karyawans.add(new Karyawan("karyawan 2", 19, 1000000));
        karyawans.add(new Karyawan("karyawan 3", 22, 1000000));

        for (Karyawan k : karyawans) {
            System.out.println(k);
        }
    }
}