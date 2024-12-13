import java.io.*;
import java.util.*;

public class StudentJournal {

    private Course course;
    private Map<String, Double> grades;
    private int retakePerCourse;
    private int studentID;
    private double firstAtt;
    private double secondAtt;
    private double finalExam;
    private double overallScore;
    private double gpaCourse;

    public StudentJournal() {
        grades = new HashMap<>();
    }

    public StudentJournal(Course course, int studentID, double firstAtt, double secondAtt, double finalExam) {
        this.course = course;
        this.studentID = studentID;
        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
        this.finalExam = finalExam;
        this.grades = new HashMap<>();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public int getRetakePerCourse() {
        return retakePerCourse;
    }

    public void setRetakePerCourse(int retakePerCourse) {
        this.retakePerCourse = retakePerCourse;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getFirstAtt() {
        return firstAtt;
    }

    public void setFirstAtt(double firstAtt) {
        this.firstAtt = firstAtt;
    }

    public double getSecondAtt() {
        return secondAtt;
    }

    public void setSecondAtt(double secondAtt) {
        this.secondAtt = secondAtt;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(double overallScore) {
        this.overallScore = overallScore;
    }

    public double getGpaCourse() {
        return gpaCourse;
    }

    public void setGpaCourse(double gpaCourse) {
        this.gpaCourse = gpaCourse;
    }

    public void calculateGPA() {
        //доделать
    }

    public void calculateMark() {
        this.overallScore = firstAtt + secondAtt + finalExam;
    }

    public boolean hasFX() {
        return finalExam >= 9.5 && finalExam <= 29.5;
    }

    public boolean canDoFinal() {
        return firstAtt + secondAtt >= 29.5;
    }

    public boolean isRetakeLessThanThree() {
        return retakePerCourse <= 3;
    }

    public void calculateCredits() {
        //доделать
    }
}
