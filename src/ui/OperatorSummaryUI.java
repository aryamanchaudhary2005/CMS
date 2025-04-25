package ui;

public class OperatorSummaryUI {
    private String operatorUser;
    private String operatorName;
    private String userType;
    private String roleName;

    public OperatorSummaryUI(String operatorUser, String operatorName, String userType, String roleName) {
        this.operatorUser = operatorUser;
        this.operatorName = operatorName;
        this.userType = userType;
        this.roleName = roleName;
    }

    // Getters
    public String getOperatorUser() { return operatorUser; }
    public String getOperatorName() { return operatorName; }
    public String getUserType() { return userType; }
    public String getRoleName() { return roleName; }
}
