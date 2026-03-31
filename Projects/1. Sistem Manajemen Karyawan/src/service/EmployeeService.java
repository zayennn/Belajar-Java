package service;

import model.Employee;

public class EmployeeService {
    public void getInfoEmplooyes(Employee emp) {
        System.out.printf("""
                Name    : %s
                Age     : %d
                Salary  : %d
                
                """, emp.name, emp.age, emp.salary);
    }

    public static Employee getNama(java.util.List<Employee> list, String name) {
        for (Employee emp : list) {
            if (emp.name.equalsIgnoreCase(name)) {
                return emp;
            }
        }
    }
}