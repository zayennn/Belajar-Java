import java.util.HashMap;
import java.util.Map;

public class Main {
    class Items<I> {
        private I nama;
        private I jumlah;

        Items(I nama, I jumlah) {
            this.nama = nama;
            this.jumlah = jumlah;
        }


    }

    public static void main(String[] args) {
        HashMap<Items> items = new HashMap<>();
    }
}