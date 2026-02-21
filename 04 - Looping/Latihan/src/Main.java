import java.util.Scanner;

public class Main {
    public static void latihan1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void latihan2(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println(total);
    }

    public static void latihan3(int com, Scanner input) {
        while (true) {
            System.out.print("masukan angka tebakan mu (1 - 10) : ");
            int user_choice = input.nextInt();

            if (user_choice == com) {
                System.out.printf("Jawabanmu : %d\n", user_choice);
                System.out.printf("angka computer : %d\n", com);
                System.out.println("tebakan mu benar!\n");
                break;
            } else {
                System.out.printf("Jawabanmu : %d\n", user_choice);
                System.out.println("angka computer : ?");
                System.out.println("tebakan mu salah!\n");
            }
        }
    }

    public static void miniProject(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        latihan 1
        System.out.print("masukan banyak angka yang ingin di cetak : ");
        int angka = input.nextInt();

        latihan1(angka);

//        latihan 2
        System.out.print("masukan angka yang ingin dijumlahkan 1 - n : ");
        int angka2 = input.nextInt();

        latihan2(angka2);


//        latihan 3
        int com = (int) (Math.random() * 10) + 1;
        latihan3(com, input);

//        latihan 4
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

//        mini project
        System.out.print("masukan angka table perkalian : ");
        int angka3 = input.nextInt();
        miniProject(angka3);

        input.close();
    }
}