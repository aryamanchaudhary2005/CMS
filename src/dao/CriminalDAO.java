package dao;
import model.Criminal;
import db.DBConnection;
import java.sql.*;
import java.util.*;

public class CriminalDAO {
    // Throw SQLException in method signature, which is appropriate for SQL-related errors
    public List<Criminal> getAllCriminals() throws SQLException {
        List<Criminal> list = new ArrayList<>();
        String query = "SELECT * FROM Criminal";


        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            
            // Process each record from ResultSet
            while (rs.next()) {
                Criminal c = new Criminal();
                c.setCriminalID(rs.getInt("CriminalID"));
                c.setCriminalNo(rs.getString("CriminalNo"));
                c.setName(rs.getString("Name"));
                c.setAddress(rs.getString("Address"));
                c.setAadhaar(rs.getString("Aadhaar"));
                c.setImage(rs.getBytes("Image"));
                list.add(c);
            }
        } catch (SQLException e) {
            // Handle exception and provide meaningful feedback
            System.err.println("Error executing query: " + e.getMessage());
            throw e;  // Rethrow the exception after logging it
        }
        return list;
    }
}

