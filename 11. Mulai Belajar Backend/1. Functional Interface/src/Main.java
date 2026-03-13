public class Main {
    interface Hitung {
        int operasi(int x, int y);
    }

    public static void main(String[] args) {
        Hitung penjumlahan = ((x, y) -> x + y);
        Hitung perkalian = ((x, y) -> x * y);


    }
}