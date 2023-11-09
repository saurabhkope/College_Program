// Q2. Write a program to create a super class Employee (members – name, salary). Derive a sub- class
// as Developer (member – projectname). Create object of Developer and display the detailsof it.

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Developer extends Employee {
    private String projectName;

    public Developer(String name, double salary, String projectName) {
        super(name, salary); // Call the constructor of the super class
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}

public class EmployeeExample2 {
    public static void main(String[] args) {
        // Create an object of the Developer class
        Developer developer = new Developer("saurabh", 60000.0, "best project");

        // Display the details of the Developer
        System.out.println("Developer Name: " + developer.getName());
        System.out.println("Developer Salary: " + developer.getSalary());
        System.out.println("Project Name: " + developer.getProjectName());
    }
}
