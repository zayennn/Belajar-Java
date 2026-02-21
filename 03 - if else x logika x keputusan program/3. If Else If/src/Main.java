import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai kamu : ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("nilai tidak valid, nilai hanya boleh 0 - 100");
        } else if (nilai > 90) {
            System.out.println("A");
        } else if (nilai > 80) {
            System.out.println("B");
        } else if (nilai > 70) {
            System.out.println("C");
        } else  {
            System.out.println("D");
        }

        input.close();
    }
}

//   if (kondisi1) {
//   }
//   else if (kondisi2) {
//   }
//   else {
//   }