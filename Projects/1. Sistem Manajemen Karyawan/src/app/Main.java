package app;

import model.Karyawan;
import service.KaryawanService;

public class Main {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan("karyawan 1", 20, 100000);
        KaryawanService.getInfoKaryawan(karyawan);
    }
}