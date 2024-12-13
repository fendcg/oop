import java.io.*;
import java.util.*;

public class Admin extends User {

    protected List<String> permissions;

    public Admin() {
        super();
        this.userType = UserType.Admin;
    }

    public List<String> getPermissions() { return permissions; }
    public void setPermissions(List<String> permissions) { this.permissions = permissions; }

    public void manageUsers() {}
    public void manageSystemSettings() {}
    public void viewLogs() {}
}
