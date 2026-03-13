public class Main {
    interface Hitung {
        int operasi(int x, int y);
    }

    public static void main(String[] args) {
        Hitung penjumlahan = ((x, y) -> x + y);
        Hitung perkalian = ((x, y) -> x * y);
//        kalau gapake lambda code nya bisa panjang, contoh :

        Hitung pengurangan = new Hitung() {
            @Override
            public int operasi(int x, int y) {
                return x - y;
            }
        };

        System.out.println("hasil penjumlahan nya adalah : " + penjumlahan.operasi(10, 20));
        System.out.println("hasil perkalian nya adalah : " + perkalian.operasi(10, 20));
        System.out.println("hasil pengurangan nya adalah : " + pengurangan.operasi(20, 10));
    }
}