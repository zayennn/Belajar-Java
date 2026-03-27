package app;

import model.Karyawan;
import service.KaryawanService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();
        KaryawanService service = new KaryawanService();

        karyawans.addAll(java.util.Arrays.asList(
                new Karyawan("elang", 19, 1000000),
                new Karyawan("zayen", 19, 1000000),
                new Karyawan("alan", 19, 1000000)
        ));

        Karyawan.perusahaan = "google";

        karyawans.forEach(service::getInfoKaryawan);
    }
}