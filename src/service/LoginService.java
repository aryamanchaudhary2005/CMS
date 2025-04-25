package service;

import dao.LoginDAO;
import model.Login;

public class LoginService {
    private LoginDAO loginDAO = new LoginDAO();

    public Login authenticateUser(String username, String password) {
        try {
            Login user = loginDAO.getLoginByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {}
}
