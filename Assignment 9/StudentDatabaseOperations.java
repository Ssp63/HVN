import java.sql.*;

public class StudentDatabaseOperations {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sonoo";
    private static final String USERNAME = "student_user";
    private static final String PASSWORD = "student123";

    public static void main(String[] args) {
        try {
            // Establishing connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // a) Insert data into the Student table
            insertData(connection);

            // b) Delete record for Roll_No 5
            deleteRecord(connection, 5);

            // c) Update city from Sangli to Pune
            updateCity(connection, "Sangli", "Pune");

            // d) Display names of students having marks greater than 60
            displayStudentsWithMarksGreaterThan(connection, 60);

            // e) Display students according to their marks in descending order
            displayStudentsByDescendingMarks(connection);

            // Closing the connection
            connection.close();
        } catch (SQLException e) {
            // Exception handling for database-related errors
            e.printStackTrace();
        }
    }

    // Method to insert data into the Student table
    private static void insertData(Connection connection) throws SQLException {
        // SQL query to insert data
        String insertQuery = "INSERT INTO Student (Roll_No, Name, City, Grade, Marks) " +
                             "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
            // Inserting data for each student
            insertStudent(statement, 1, "Atul", "Sangli", 'A', 90.50);
            insertStudent(statement, 2, "Sangram", "Sangli", 'B', 70.25);
            insertStudent(statement, 3, "Satya", "Mumbai", 'B', 61.36);
            insertStudent(statement, 4, "Jaydeep", "Pune", 'B', 60.95);
            insertStudent(statement, 5, "Prashant", "Sangli", 'C', 55.26);
            insertStudent(statement, 6, "Abhi", "Pune", 'C', 55.84);
        }
    }

    // Helper method to insert data for a single student
    private static void insertStudent(PreparedStatement statement, int rollNo, String name,
                                       String city, char grade, double marks) throws SQLException {
        statement.setInt(1, rollNo);
        statement.setString(2, name);
        statement.setString(3, city);
        statement.setString(4, String.valueOf(grade));
        statement.setDouble(5, marks);
        statement.executeUpdate();
    }

    // Method to delete record for a given Roll_No
    private static void deleteRecord(Connection connection, int rollNo) throws SQLException {
        // SQL query to delete record
        String deleteQuery = "DELETE FROM Student WHERE Roll_No = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
            statement.setInt(1, rollNo);
            statement.executeUpdate();
        }
    }

    // Method to update city from oldCity to newCity
    private static void updateCity(Connection connection, String oldCity, String newCity) throws SQLException {
        // SQL query to update city
        String updateQuery = "UPDATE Student SET City = ? WHERE City = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setString(1, newCity);
            statement.setString(2, oldCity);
            statement.executeUpdate();
        }
    }

    // Method to display names of students having marks greater than a specified value
    private static void displayStudentsWithMarksGreaterThan(Connection connection, double marksThreshold) throws SQLException {
        // SQL query to select names of students with marks greater than the threshold
        String selectQuery = "SELECT Name FROM Student WHERE Marks > ?";
        try (PreparedStatement statement = connection.prepareStatement(selectQuery)) {
            statement.setDouble(1, marksThreshold);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("Names of students with marks greater than " + marksThreshold + ":");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }
        }
    }

    // Method to display students according to their marks in descending order
    private static void displayStudentsByDescendingMarks(Connection connection) throws SQLException {
        // SQL query to select students ordered by marks in descending order
        String selectQuery = "SELECT Name, Marks FROM Student ORDER BY Marks DESC";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            System.out.println("Students ordered by marks (Descending order):");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Name") + " - Marks: " + resultSet.getDouble("Marks"));
            }
        }
    }
}

