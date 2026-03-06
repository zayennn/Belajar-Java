public class Main{
    static class Box<T> {
        private T isi;

        Box(T isi) {
            this.isi = isi;
        }

        T getIsi() {
            return isi;
        }

        T setIsi(T isi) {
            return isi;
        }
    }

    public static void main(String[] args) {
        Box<String> kotak_string = new Box<>("hello");
        Box<Integer> kotak_integer = new Box<>(100);

        System.out.println(kotak_string.getIsi());
        System.out.println(kotak_integer.setIsi(kotak_integer.isi));
    }
}