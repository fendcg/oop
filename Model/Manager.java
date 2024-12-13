import java.io.*;
import java.util.*;

public class Manager extends Employee {

    protected ManagerType managerType;

    public Manager() {
        super();
    }

    public ManagerType getManagerType() { return managerType; }
    public void setManagerType(ManagerType managerType) { this.managerType = managerType; }

    public void approveRegistration() {}
    public void addCourseForRegistration() {}
    public void assignCourse() {}
    public void createStatisticalReports() {}
    public void manageNews() {}
    public void viewInfoStudent() {}
    public void viewInfoTeachers() {}
    public void viewRequest() {}
}
