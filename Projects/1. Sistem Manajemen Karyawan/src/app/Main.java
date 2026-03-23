package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan("karyawan 1", 20, 1000000);
        KaryawanService.getInfoKaryawan(karyawan);
    }
}