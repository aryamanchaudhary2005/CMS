package dao;

import model.FIR;
import db.DBConnection;
import java.sql.*;
import java.util.*;

public class FIRDAO {
    public List<FIR> getAllFIRs() throws SQLException {
        List<FIR> firList = new ArrayList<>();
        String query = "SELECT * FROM FIR";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                FIR f = new FIR();
                f.setFirNo(rs.getInt("FIRNo"));
                f.setName(rs.getString("Name"));
                f.setDate(rs.getDate("Date"));
                f.setCrime(rs.getString("Crime"));
                f.setGender(rs.getString("Gender"));
                f.setAlias(rs.getString("Alias"));
                f.setAddress(rs.getString("Address"));
                f.setAadhaar(rs.getString("Aadhaar"));
                f.setImage(rs.getBytes("Image"));
                f.setCriminalID(rs.getInt("CriminalID"));
                firList.add(f);
            }
        }
        return firList;
    }
}
