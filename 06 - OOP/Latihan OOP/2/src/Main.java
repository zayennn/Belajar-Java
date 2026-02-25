public class Main {
    static class PersegiPanjang {
        int panjang;
        int lebar;

        PersegiPanjang(int x, int y) {
            this.panjang = x;
            this.lebar = y;
        }

        void hitungLuas() {
            System.out.printf("""
                    panjang persegi adalah                : %d
                    lebar persegi adalah                  : %d
                    total luas persegi panjang nya adalah : %d
                    """, panjang, lebar, (panjang * lebar));
        }

        int hitungKeliling() {
            return 2 * (panjang + lebar);
        }
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        System.out.printf("""
panjang persegi adalah                : %d
lebar persegi adalah                  : %d
total keliling persegi panjang nya adalah : %d
                """, pp.panjang, pp.lebar, pp.hitungKeliling());
    }
}