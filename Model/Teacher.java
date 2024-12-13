
import java.io.*;
import java.util.*;

public class Teacher extends Employee {

    protected TeacherType teacherType;
    protected List<String> courses;

    public Teacher() {
        super();
    }

    public TeacherType getTeacherType() { return teacherType; }
    public void setTeacherType(TeacherType teacherType) { this.teacherType = teacherType; }

    public List<String> getCourses() { return courses; }
    public void setCourses(List<String> courses) { this.courses = courses; }

    public void viewCourses() {}
    public void manageCourse() {}
    public void viewStudents() {}
    public void viewStudentsInfo() {}
    public void putMark() {}
    public void sendComplaints(UrgencyLevel urgencyLevel, String complaint) {}
}