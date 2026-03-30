package app;

import model.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(java.util.Arrays.asList(
                new Employee("karyawan 1", 20, 5000000),
                new Employee("karyawan 2", 20, 3000000),
                new Employee("karyawan 3", 20, 5400000)
        ));

        for (int i = 0; i < employees.toArray().length; i++) {
            System.out.println(employees.get(i));
        }
    }
}