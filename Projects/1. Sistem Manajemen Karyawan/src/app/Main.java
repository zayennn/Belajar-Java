package app;

import model.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        employees.addAll(java.util.Arrays.asList(
                new Employee("karyawan 1", 20, 5000000),
                new Employee("karyawan 2", 20, 3000000),
                new Employee("karyawan 3", 20, 5400000)
        ));

        while (true) {
            System.out.print("""
                    ====================== Sistem Manajemen Karyawan ======================
                    1. Tambah karyawan
                    2. Hapus karyawan
                    3. Tampilkan semua karyawan
                    4. Cari karyawan berdasarkan nama
                    5. Sorting (gaji / umur)
                    6. Filter (gaji > sekian)
                    7. Keluar
                    """);

            System.out.print("Masukan menu pilihan anda : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 :
                    System.out.print("Berapa karyawan yang ingin anda tambahkan ? : ");
                    int number_of_inputs = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < number_of_inputs; i++) {
                        System.out.print("Masukan nama karyawan : ");
                        String name = input.nextLine();

                        System.out.print("Masukan umur karyawan : ");
                        int age = input.nextInt();
                        input.nextLine();

                        System.out.print("Masukan gaji karyawan : ");
                        int salary = input.nextInt();
                        input.nextLine();
                    }

                    break;

                case 2 :
                    System.out.print("Siapa nama karyawan yang ingin anda hapus ? : ");
                    String name = input.nextLine();

                    employees.removeIf(employee -> employee.name.equalsIgnoreCase(name));

                    break;

                case 3 :
                    employees.forEach(service::getInfoEmplooyes);
                    break;

                case 4 :
                    System.out.print("Masukan nama karyawan yang ingin anda cari : ");
                    String search_name = input.nextLine();

                    break;
            }
        }
    }
}