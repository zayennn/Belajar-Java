public class Main {
    interface OperatiMatematika {
        int hitung(int a, int b);
    }

    public static void main(String[] args) {
        OperatiMatematika penjumlahan = ((a, b) -> a + b);
        OperatiMatematika pengurangan = ((a, b) -> a - b);
        OperatiMatematika perkalian = ((a, b) -> a * b);
    }
}