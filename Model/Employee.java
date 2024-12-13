import java.io.*;
import java.util.*;

public class Employee extends User {

    protected String department;
    protected double salary;
    protected String yearOfJoin;

    public Employee() {
        super();
    }


    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getYearOfJoin() { return yearOfJoin; }
    public void setYearOfJoin(String yearOfJoin) { this.yearOfJoin = yearOfJoin; }
}
