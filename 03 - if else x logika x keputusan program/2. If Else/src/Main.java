import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan username : ");
        String username = input.nextLine();

        System.out.print("masukan password : ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("12345")) {
            System.out.print("login berhasil");
        } else {
            System.out.print("login gagal");
        }

        input.close();
    }
}

//  if (kondisi) {
//     aksi true;
//  } else {
//      aksi false;
//  }