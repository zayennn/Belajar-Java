package app;

import model.Employee;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("karyawan 1", 20, 5000000);
        Employee employee = new Employee();

        employee.name = "karyawan 1";
        employee.age = 20;
        employee.salary = 5000000;


        System.out.println(employee.name);
    }
}