// Q2. Write a program to create a super class Employee (members – name, salary). Derive a sub- class
// Programmer (member – proglanguage). Create object of Programmer and display the details of it

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Programmer extends Employee {
    String proglanguage;

    Programmer(String name, double salary, String proglanguage) {
        super(name, salary);
        this.proglanguage = proglanguage;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + proglanguage);
    }
}

public class EmployeeDetails2 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("saurabh ", 75000.0, "Java");
        programmer.displayDetails();
    }
}
