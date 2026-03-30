package service;

import model.Employee;

public class EmployeeService {
    public static void getInfoEmplooyes(Employee emp) {
        System.out.printf("""
                Name    : %s
                Age     : %d
                Salary  : %d
                """, emp.name, emp.age, emp.salary);
    }
}