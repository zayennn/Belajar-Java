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
                    1.Tambah karyawan
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
                    System.out.print();
            }
        }
    }
}