package dao;

import model.Admin;
import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {

    public Admin getAdminByUsername(String username) {
        String query = "SELECT * FROM Admin WHERE UserName = ?";
        Admin admin = null;

        try (Connection con = DBConnection.getConnection(); // Use try-with-resources to auto-close resources
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                admin = new Admin();
                admin.setAdminUser(rs.getString("AdminUser"));
                admin.setAdminPass(rs.getString("AdminPass"));
                admin.setUserName(rs.getString("UserName"));
            }

            rs.close(); // Closing ResultSet
        } catch (SQLException e) {
            System.out.println("Error during database operation.");
            e.printStackTrace(); // Better exception handling
        }

        return admin;
    }
}

