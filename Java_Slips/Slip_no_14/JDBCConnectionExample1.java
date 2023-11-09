// Q1. Write a program to create JDBC connection. On successful connection with database display
// appropriate message to user.
// run jdbc program
// javac -d . -cp /home/sktech/Downloads/postgresql-42.6.0.jar JDBCConnectionExample1.java 
// java -cp  /home/sktech/Downloads/postgresql-42.6.0.jar:. JDBCConnectionExample1

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionExample1 {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:postgresql://localhost:5432/saurabh";
        String username = "postgres";
        String password = "1644";

        // Connection object
        Connection connection = null;

        try {
            // Attempt to connect to the database
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
