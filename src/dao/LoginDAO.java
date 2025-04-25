package dao;

import model.Login;
import db.DBConnection;
import java.sql.*;

public class LoginDAO {
    public Login getLoginByUsername(String username) throws SQLException {
        String query = "SELECT * FROM Login WHERE UserName = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Login login = new Login();
                login.setUserName(rs.getString("UserName"));
                login.setPassword(rs.getString("Password"));
                login.setUserType(rs.getString("UserType"));
                login.setRoleID(rs.getInt("RoleID"));
                return login;
            }
        }
        return null;
    }
}
