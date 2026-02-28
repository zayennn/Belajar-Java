// inheritance → kaya hubungan keluarga
// interface → kemampuan

/*
* contoh :
* burung bisa terbang
* pesawat bisa terbang
* capybara obake bisa terbang*/

// mereka beda kelas tapi punya behavior sama
// itu fungsi nya interface

// basic interface :
interface Terbang {
    void terbang();
}

// implementasi :
class Burung implements Terbang {
    public void terbang() {
        System.out.println("burung terbang dengan sayap");
    }
}

// didalem implements default nya adalah public abstract

// keyword : implements

// beda nya interface dan abstract class :
/* | Abstract                | Interface                 |
   | ----------------------- | ------------------------- |
   | Bisa punya field normal | Field selalu final static |
   | Bisa punya constructor  | Tidak punya constructor   |
   | Single inheritance      | Bisa multiple             |
*/

// java gabisa :
// class A extends B, C
// tapi bisa
// class A implements B, C, D dst → multiple behavior

// contoh polymorphism interface
interface Pembayaran{
    void bayar(int jumlah);
}

class Dana implements Pembayaran{
    public void bayar(int jumlah) {
        System.out.println("bayar pake dana : " + jumlah);
    }
}

class Ovo implements Pembayaran{
    public void bayar(int jumlah) {
        System.out.println("bayar pake ovo : " + jumlah);
    }
}

public class Main {
    public static void main(String[] args) {
        Pembayaran[] daftar = {
            new Dana(),
            new Ovo()
        };

        for (Pembayaran p : daftar) {
            p.bayar(1000000);
        }
    }
}