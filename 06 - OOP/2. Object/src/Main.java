public class Main {
    static class Mahasiswa{
        String nama;
        int umur;
    }

    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Elang";
        m1.umur = 19;

        System.out.println(m1.nama);
        System.out.println(m1.umur);

    }
}