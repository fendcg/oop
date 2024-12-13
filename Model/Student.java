import java.io.*;
import java.util.*;

public class Student extends User {

    protected StudentType studentType;
    protected String level;
    protected String yearOfAdmission;
    protected List<String> courses;
    protected String category;
    protected String speciality;

    public Student() {
        super();
    }

    public StudentType getStudentType() { return studentType; }
    public void setStudentType(StudentType studentType) { this.studentType = studentType; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    public String getYearOfAdmission() { return yearOfAdmission; }
    public void setYearOfAdmission(String yearOfAdmission) { this.yearOfAdmission = yearOfAdmission; }

    public List<String> getCourses() { return courses; }
    public void setCourses(List<String> courses) { this.courses = courses; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }

    public void viewCourses() {}
    public void registerToCourse() {}
    public void viewTeacherInfo() {}
    public void rateTeacher() {}
    public void viewMarks() {}
    public void viewTranscript() {}
    public void getTranscript() {}
}
