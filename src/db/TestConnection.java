package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/CrimeManagementDB"; // Change DB name if needed
        String username = "root"; // Update with your MySQL username
        String password = "root"; // Update with your MySQL password

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Database connection successful!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Database connection failed:");
            e.printStackTrace();
        }
    }
}
