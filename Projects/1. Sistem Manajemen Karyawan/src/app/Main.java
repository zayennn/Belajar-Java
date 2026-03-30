package app;

import model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("karyawan 1", 20, 5000000);
        System.out.println(employee);
    }
}