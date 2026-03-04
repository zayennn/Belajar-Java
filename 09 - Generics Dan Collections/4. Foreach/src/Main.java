public class Main {
    public static void main(String[] args) {
//        kalau sebelum nya kita ingin menampilkan semua isi dari array menggunakan looping contoh :

        String[] namas = {"fulan", "fulana", "fulani", "fulano"};

        for (int i = 0; i < namas.length; i++) {
            System.out.println(namas[i]);
        }

//        untuk menampilkan data seperti ini tu bisa cuma rasa nya primitif
//        ada cara lain yang lebih modern yaitu dengan cara :

        for (String nama : namas) {
            System.out.println(nama);
        }

//        output yang dihasilkan akan sama tapi penulisan nya jauh lebih clean dari yang sebelumnya
    }
}