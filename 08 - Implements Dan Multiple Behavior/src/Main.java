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