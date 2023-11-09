// Q2. Write a JDBC program to update number_of_students of “BCA Science” to 1000. Create a
// table Course (Code,name, department,number_of_students) in PostgreSQL database. Insertvalues
// in the table.
//CREATE TABLE ACCORDING TO PROGRAM IN TO  YOUR DATABASE 
// CREATE TABLE Course (
    // Code SERIAL PRIMARY KEY,
    // name VARCHAR(255) NOT NULL,
    // department VARCHAR(255),
    // number_of_students INT
// );
// 
// INSERT INTO Course (name, department, number_of_students) VALUES
// ('BCA Science', 'Computer Science', 500),
// ('MBA Finance', 'Management', 300),
// ('Engineering', 'Mechanical Engineering', 700);

//RUN PROGRAM
//javac -d . -cp /home/sktech/Downloads/postgresql-42.6.0.jar UpdateCourseStudents3.java 
//java -cp /home/sktech/Downloads/postgresql-42.6.0.jar:. UpdateCourseStudents3

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCourseStudents3 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Step 1: Load and register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish a connection to the database
            String url = "jdbc:postgresql://localhost:5432/saurabh";
            String username = "postgres";
            String password = "1644";
            connection = DriverManager.getConnection(url, username, password);

            // Step 3: Define the SQL query to update the number_of_students
            String updateQuery = "UPDATE Course SET number_of_students = 1000 WHERE name = ?";

            // Step 4: Create a PreparedStatement for the update query
            preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, "BCA Science"); // Set the course name

            // Step 5: Execute the update
            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Number of students for 'BCA Science' updated to 1000.");
            } else {
                System.out.println("No rows were updated. Course not found.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the resources
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
