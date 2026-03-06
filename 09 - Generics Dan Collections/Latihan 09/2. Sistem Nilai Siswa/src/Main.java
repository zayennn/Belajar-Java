import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        HashMap<String, Integer> siswas = new HashMap<>();

        siswas.put("capytanic", 78);
        siswas.put("capypoter", 72);
        siswas.put("capyking", 90);
        siswas.put("capyjayen", 88);

        for (Map.Entry<String, Integer> siswa : siswas.entrySet()) {
            System.out.printf("nama siswa : %s\n", siswa.getKey());
            System.out.printf("nilai siswa : %d\n", siswa.getValue());
            System.out.println("");
        }
    }
}