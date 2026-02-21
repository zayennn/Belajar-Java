public class Main {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}

// beda nya dengan while : kondisi dicek setelah eksekusi.
// Walaupun kondisi false → tetap jalan sekali.