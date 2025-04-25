package dao;

import model.Operator;
import db.DBConnection;
import java.sql.*;

public class OperatorDAO {
    public Operator getOperatorByUsername(String username) throws SQLException {
        String query = "SELECT * FROM Operator WHERE UserName = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Operator operator = new Operator();
                operator.setOperatorUser(rs.getString("OperatorUser"));
                operator.setOperatorPass(rs.getString("OperatorPass"));
                operator.setOperatorName(rs.getString("OperatorName"));
                operator.setImage(rs.getBytes("Image"));
                operator.setUserName(rs.getString("UserName"));
                return operator;
            }
        }
        return null;
    }
}
