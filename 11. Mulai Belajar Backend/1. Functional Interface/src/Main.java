// functional interface adalah interface yang hanya memiliki satu method abstract
// contoh paling sederhana :

// interface Hitung {
//     int operasi(int a, int b);
// }

// artinya interface ini hanya punya satu kontrak yaitu : operasi(int a, int b)
// interface seperti ini bisa dipakai oleh lambda expression

// contoh lengkap :

public class Main {
    interface Hitung {
        int operasi(int a, int b);
    }

    public static void main(String[] args) {
//        Hitung tambah = (a, b) -> a + b;
//        Hitung perkalian = (a, b) -> a * b;

//      ada cara lain selain menggunakann lambda expression dengan cara membuat object baru , contoh nya :
        Hitung tambah = new Hitung() {
            @Override
            public int operasi(int a, int b) {
                return a + b;
            }
        };
        Hitung perkalian = new Hitung() {
            @Override
            public int operasi(int a, int b) {
                return a + b;
            }
        };

        System.out.println("hasil tambah = " + tambah.operasi(10, 20));
        System.out.println("hasil perkalian = " + perkalian.operasi(10, 20));
    }
}