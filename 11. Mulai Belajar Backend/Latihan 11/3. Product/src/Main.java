// latihan 3
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static class Product {
        String nama;
        int harga;

        Product(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.addAll(Arrays.asList(
                new Product("Laptop", 12000000),
                new Product("Mouse", 150000),
                new Product("Keyboard", 350000),
                new Product("Monitor", 2500000),
                new Product("Headset", 500000)
        ));

        products.stream()
                .map(product -> product.nama)
                .forEach(System.out::println);
    }
}