package model;

public class Permission {
    private int permissionID;
    private int roleID;
    private String permissionType;

    public int getPermissionID() { return permissionID; }
    public void setPermissionID(int permissionID) { this.permissionID = permissionID; }

    public int getRoleID() { return roleID; }
    public void setRoleID(int roleID) { this.roleID = roleID; }

    public String getPermissionType() { return permissionType; }
    public void setPermissionType(String permissionType) { this.permissionType = permissionType; }
}
