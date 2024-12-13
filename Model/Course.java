import java.io.*;
import java.util.*;

public class Course {

    private String courseName;
    private String courseID;
    private List<String> instructors;
    private List<String> students;
    private CourseType courseType;
    private int credits;
    private int limitOfStudents;


    public Course() {
        instructors = new ArrayList<>();
        students = new ArrayList<>();
    }


    public Course(String courseName, String courseID, CourseType courseType, int credits, int limitOfStudents) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseType = courseType;
        this.credits = credits;
        this.limitOfStudents = limitOfStudents;
        this.instructors = new ArrayList<>();
        this.students = new ArrayList<>();
    }


    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public List<String> getInstructors() {
        return instructors;
    }
    public void addInstructor(String instructor) {
        this.instructors.add(instructor);
    }

    public List<String> getStudents() {
        return students;
    }
    public void addStudent(String student) {
        if (students.size() < limitOfStudents) {
            this.students.add(student);
        } else {
            System.out.println("Cannot add more students. Course limit reached.");
        }
    }

    public CourseType getCourseType() {
        return courseType;
    }
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public int getLimitOfStudents() {
        return limitOfStudents;
    }
    public void setLimitOfStudents(int limitOfStudents) {
        this.limitOfStudents = limitOfStudents;
    }

    public String getCourseSummary() {
        return courseName + " (" + courseID + ") - Type: " + courseType + ", Credits: " + credits + " | Instructors: " + instructors;
    }
}
