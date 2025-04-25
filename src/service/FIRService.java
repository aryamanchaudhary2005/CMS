package service;

import dao.FIRDAO;
import model.FIR;
import java.util.List;

public class FIRService {
    private FIRDAO firDAO = new FIRDAO();

    public List<FIR> getAllFIRs() {
        try {
            return firDAO.getAllFIRs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
