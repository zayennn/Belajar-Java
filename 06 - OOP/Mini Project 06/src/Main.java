class Mahasiswa {
    private String nama;
    private double nilai;

    Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai= nilai;
    }

    String tampilkanData() {
        String status = nilai >= 75 ? "lulus" : "tidak lulus";
        return String.format("""
nama mahasiswa   : %s
nilai mahasiswa  : %.2f
status mahasiswa : %s
                """, nama, nilai, status);
    }
}

public class Main{
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("capytanic", 76);
        daftar[1] = new Mahasiswa("capyking", 91);
        daftar[2] = new Mahasiswa("capypoter", 86);

        for (int i = 0; i < daftar.length; i++) {
            System.out.println(daftar[i].tampilkanData());
        }
    }
}