package model;

public class Operator {
    private String operatorUser;
    private String operatorPass;
    private String operatorName;
    private byte[] image;
    private String userName;

    public String getOperatorUser() { return operatorUser; }
    public void setOperatorUser(String operatorUser) { this.operatorUser = operatorUser; }

    public String getOperatorPass() { return operatorPass; }
    public void setOperatorPass(String operatorPass) { this.operatorPass = operatorPass; }

    public String getOperatorName() { return operatorName; }
    public void setOperatorName(String operatorName) { this.operatorName = operatorName; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
}
