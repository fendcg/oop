public class BookJournal {
    private Book book;
    private String borrowedBy;
    private java.util.Date borrowDate;
    private java.util.Date returnDate;

    public BookJournal(Book book, String borrowedBy, java.util.Date borrowDate, java.util.Date returnDate) {
        this.book = book;
        this.borrowedBy = borrowedBy;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public java.util.Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(java.util.Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public java.util.Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(java.util.Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isOverdue() {
        java.util.Date currentDate = new java.util.Date();
        return currentDate.after(returnDate);
    }

    public int getDaysBorrowed() {
        long diffInMillies = Math.abs(returnDate.getTime() - borrowDate.getTime());
        return (int) (diffInMillies / (1000 * 60 * 60 * 24));
    }
}