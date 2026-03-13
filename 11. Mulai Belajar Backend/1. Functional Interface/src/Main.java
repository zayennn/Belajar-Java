public class Main {
    interface Hitung {
        int operasi(int x, int y);
    }

    public static void main(String[] args) {
        Hitung penjumlahan = ((x, y) -> x + y);
        Hitung perkalian = ((x, y) -> x * y);

        System.out.println("hasil penjumlahan nya adalah : " + penjumlahan.operasi(10, 20));
        System.out.println("hasil perkalian nya adalah : " + perkalian.operasi(10, 20));
    }
}