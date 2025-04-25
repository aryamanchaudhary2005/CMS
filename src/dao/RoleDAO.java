package dao;

import model.Role;
import db.DBConnection; // ✅ updated package name
import java.sql.*;
import java.util.*;

public class RoleDAO {
    public List<Role> getAllRoles() throws SQLException {
        List<Role> roles = new ArrayList<>();
        String query = "SELECT * FROM Roles";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                Role role = new Role();
                role.setRoleID(rs.getInt("RoleID"));
                role.setRoleType(rs.getString("RoleType"));
                role.setRoleDescription(rs.getString("RoleDescription"));
                roles.add(role);
            }
        }
        return roles;
    }
}
