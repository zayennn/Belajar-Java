package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();

        karyawans.addAll(java.util.Arrays.asList(
                new Karyawan("karyawan 1", 20, 1000000),
                new Karyawan("karyawan 2", 19, 3000000),
                new Karyawan("karyawan 3", 30, 2000000)
        ));
    }
}