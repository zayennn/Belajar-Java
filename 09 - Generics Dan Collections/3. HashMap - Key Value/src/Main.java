import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("BMW", 1000000000);
        products.put("H2", 800000000);

        System.out.println(products.get("BMW"));
    }
}

// key → value