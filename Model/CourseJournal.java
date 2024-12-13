import java.io.*;
import java.util.*;


public class CourseJournal {

    private Course course;
    private String studentName;
    private double grade;
    private Map<String, Double> grades;
    private String assignedTeacher;

    public CourseJournal() {
        grades = new HashMap<>();
    }

    public CourseJournal(Course course, String studentName, double grade, String assignedTeacher) {
        this.course = course;
        this.studentName = studentName;
        this.grade = grade;
        this.assignedTeacher = assignedTeacher;
        this.grades = new HashMap<>();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public String getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setAssignedTeacher(String assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }


    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (double grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }


    public List<Map.Entry<String, Double>> sortPerScore() {
        List<Map.Entry<String, Double>> sortedGrades = new ArrayList<>(grades.entrySet());
        sortedGrades.sort((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()));
        return sortedGrades;
    }


    public void addGrade(String studentName, double grade) {
        grades.put(studentName, grade);
    }


    public String getJournalSummary() {
        return "Course: " + course.getCourseName() + " (ID: " + course.getCourseID() + "), Teacher: " + assignedTeacher;
    }
}
