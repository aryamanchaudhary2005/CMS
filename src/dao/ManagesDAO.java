package dao;

import model.Manages;
import db.DBConnection;
import java.sql.*;
import java.util.*;

public class ManagesDAO {
    public List<Manages> getAllMappings() throws SQLException {
        List<Manages> list = new ArrayList<>();
        String query = "SELECT * FROM Manages";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                Manages m = new Manages();
                m.setUserName(rs.getString("UserName"));
                m.setFirNo(rs.getInt("FIRNo"));
                m.setCriminalID(rs.getInt("CriminalID"));
                list.add(m);
            }
        }
        return list;
    }
}
