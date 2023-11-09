// Q2. Create and insert values to Person table (PID, name, gender, birth_year) in postgreSQL database. 
// Write a JDBC program to display information about the ResultSet like number of columns
// available in the ResultSet and SQL type of each column using ResultSetMetaData.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetadataExample3 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/saurabh";
        String username = "postgres";
        String password = "1644";

        try {
            // Step 1: Load and register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Step 3: Create a Statement for executing SQL queries
            Statement statement = connection.createStatement();

            // Step 4: Execute a query to retrieve data
            String selectQuery = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Step 5: Retrieve ResultSet metadata
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            System.out.println("Number of columns in ResultSet: " + columnCount);

            System.out.println("Column Information:");
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                String columnType = metaData.getColumnTypeName(i);
                System.out.println("Column " + i + ": " + columnName + " (Type: " + columnType + ")");
            }

            // Step 6: Display the ResultSet data
            while (resultSet.next()) {
                int pid = resultSet.getInt("PID");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int birthYear = resultSet.getInt("birth_year");

                System.out.println("PID: " + pid + ", Name: " + name + ", Gender: " + gender + ", Birth Year: " + birthYear);
            }

            // Step 7: Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

