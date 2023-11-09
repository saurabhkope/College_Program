// Q2. Write a JDBC program to insert the records into the table Employee (ID, name, salary) using
// PreparedStatement interface. Accept details of Employees from user. [20 Marks]
//first download the jdbc driver and set the path compile time eg below-
// javac -d . -cp  /home/sktech/Downloads/postgresql-42.6.0.jar EmployeeInsert3.java
// java -cp /home/sktech/Downloads/postgresql-42.6.0.jar:. EmployeeInsert3

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeInsert3 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Step 1: Establish a database connection
            String url = "jdbc:postgresql://localhost:5432/saurabh";
            String username = "postgres";
            String password = "1644"; // Replace with your actual password

            connection = DriverManager.getConnection(url, username, password);

            // Step 2: Prepare the SQL statement with placeholders
            String insertQuery = "INSERT INTO Employee (id, ename, esalary) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertQuery);

            // Step 3: Accept details of Employees from the user and insert records
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter Employee ID (0 to exit): ");
                int id = scanner.nextInt();
                if (id == 0) {
                    break;
                }

                System.out.print("Enter Employee Name: ");
                String name = scanner.next();
                System.out.print("Enter Employee Salary: ");
                double salary = scanner.nextDouble();

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setDouble(3, salary);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Record inserted successfully!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

