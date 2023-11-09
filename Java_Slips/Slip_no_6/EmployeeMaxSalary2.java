// Q2. Write a program which define class Employee with data member as id, name and salary Store 
// the information of 'n' employees and Display the name of employee having maximum salary (Use 
// array of object).

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeMaxSalary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees (n): ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary(employees);

        if (employeeWithMaxSalary != null) {
            System.out.println("Employee with Maximum Salary:");
            System.out.println("ID: " + employeeWithMaxSalary.id);
            System.out.println("Name: " + employeeWithMaxSalary.name);
            System.out.println("Salary: " + employeeWithMaxSalary.salary);
        } else {
            System.out.println("No employees entered.");
        }
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        if (employees.length == 0) {
            return null;
        }

        Employee maxSalaryEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = employee;
            }
        }

        return maxSalaryEmployee;
    }
}

