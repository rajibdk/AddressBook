package tutorial.adressbook.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCService {
    private Connection connection = null;
    public void createConnection(String url, String username, String password) throws SQLException {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database!!");
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database!!");
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    public int executeQueries(String query) throws SQLException {
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(query);
        System.out.println("Statement executed, no of rows affected is " + count);
        return count;
    }
}
