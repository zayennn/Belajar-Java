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

        employees.forEach(service::getInfoEmplooyes);
    }
}