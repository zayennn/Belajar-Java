public class Main {
    interface OperatiMatematika {
        int hitung(int a, int b);
    }

    public static void main(String[] args) {
        OperatiMatematika penjumlahan = ((a, b) -> a + b);
        OperatiMatematika pengurangan = ((a, b) -> a - b);
        OperatiMatematika perkalian = ((a, b) -> a * b);

        System.out.println("Hasil dari penjumlahan : " + penjumlahan.hitung(10, 5));
        System.out.println("Hasil dari pengurangan : " + pengurangan.hitung(10, 5));
        System.out.println("Hasil dari perkalian : " + perkalian.hitung(10, 5));
    }
}