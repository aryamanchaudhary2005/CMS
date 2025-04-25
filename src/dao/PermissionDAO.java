package dao;

import model.Permission;
import db.DBConnection;
import java.sql.*;
import java.util.*;

public class PermissionDAO {
    public List<Permission> getPermissionsByRole(int roleID) throws SQLException {
        List<Permission> permissions = new ArrayList<>();
        String query = "SELECT * FROM Permissions WHERE RoleID = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, roleID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Permission p = new Permission();
                p.setPermissionID(rs.getInt("PermissionID"));
                p.setRoleID(rs.getInt("RoleID"));
                p.setPermissionType(rs.getString("PermissionType"));
                permissions.add(p);
            }
        }
        return permissions;
    }
}
