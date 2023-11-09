// Q1. Create a Hash table containing Employee name and Salary. Display the details of the hash
// table

import java.util.Hashtable;
import java.util.Map;

public class EmployeeHashtable1 {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details
        Hashtable<String, Double> employeeSalaries = new Hashtable<>();

        // Add employee names and salaries to the Hashtable
        employeeSalaries.put("saurabh", 50000.0);
        employeeSalaries.put("yogesh", 60000.0);
        employeeSalaries.put("arbaj", 55000.0);
        employeeSalaries.put("hrushali", 62000.0);

        // Display the details of the Hashtable
        System.out.println("Employee Details:");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            String name = entry.getKey();
            double salary = entry.getValue();
            System.out.println("Name: " + name + ", Salary: " + salary);
        }
    }
}
