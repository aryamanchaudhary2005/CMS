package service;

import dao.CriminalDAO;
import model.Criminal;

import java.util.List;

public class CriminalService {
    private CriminalDAO criminalDAO = new CriminalDAO();

    public List<Criminal> getAllCriminals() {
        try {
            return criminalDAO.getAllCriminals();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
