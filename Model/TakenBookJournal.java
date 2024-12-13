import java.io.*;
import java.util.*;

public class TakenBookJournal {

    private Book book;
    private Student student;
    private Date takenDate;
    private Date returnDate;

    public TakenBookJournal() {
    }

    public TakenBookJournal(Book book, Student student, Date takenDate, Date returnDate) {
        this.book = book;
        this.student = student;
        this.takenDate = takenDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(Date takenDate) {
        this.takenDate = takenDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
