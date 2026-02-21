public class Main {
    public static void main(String[] args) {
        System.out.println("============ Biodata ============");

        String nama = "elang";
        int umur = 19;
        double tinggi = 175.5;
        boolean mahasiswa = true;

        System.out.printf("nama: %s\n", nama);
        System.out.printf("umur: %d\n", umur);
        System.out.printf("tinggi: %f\n", tinggi);
        System.out.printf("mahasiswa: %b\n", mahasiswa);
    }
}

//  | Tipe data      | Format |
//  | -------------- | ------ |
//  | String         | `%s`   |
//  | int / integer  | `%d`   |
//  | float / double | `%f`   |
//  | boolean        | `%b`   |
