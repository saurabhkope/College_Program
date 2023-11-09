// Q2. Write a JDBC program to display all the details of the Person table in proper format on the
// screen. Create and insert values in Person table with fields as PID, name, gender, birth_year in
// PostgreSQL database
//first download the jdbc driver and set the path compile time eg below-
//javac -d . -cp /home/sktech/Downloads/postgresql-42.6.0.jar Persondetails.java 
//java -cp /home/sktech/Downloads/postgresql-42.6.0.jar:. Persondetails

import java.sql.*;

public class Persondetails {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Load and register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish a connection to the database
            String url = "jdbc:postgresql://localhost:5432/saurabh";
            String username = "postgres";
            String password = "1644";
            connection = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement object to execute SQL queries
            statement = connection.createStatement();

            // Step 4: Execute the SQL query to retrieve all details from the Person table
            String query = "SELECT * FROM Person";
            resultSet = statement.executeQuery(query);

            // Step 5: Display the details of the Person table
            while (resultSet.next()) {
                int pid = resultSet.getInt("PID");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int birthYear = resultSet.getInt("birth_year");

                System.out.println("PID: " + pid);
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Birth Year: " + birthYear);
                System.out.println("------------------------");
            }
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 
        //optional 
        finally {
            // Step 6: Close the resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
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
