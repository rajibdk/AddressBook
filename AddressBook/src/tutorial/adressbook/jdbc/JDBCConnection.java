package tutorial.adressbook.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:postgresql://192.168.33.15:5432/testDB";
        String userName = "postgres";
        String password = "postgres";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            System.out.println("Successfully connected to the database!!");

            String query = "INSERT INTO contact VALUES ('Alina', '12345')";
            Statement statement = connection.createStatement();
            int count = statement.executeUpdate(query);
            System.out.println("Statement executed, no of rows affected is " + count);

        } catch (SQLException e) {
            System.err.println("Failed to connect to the database!!");
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }
}
