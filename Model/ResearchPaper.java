public class ResearchPaper {
    private String title;
    private String author;
    private String abstractText;
    private java.util.Date publishDate;

    // Constructor
    public ResearchPaper(String title, String author, String abstractText, java.util.Date publishDate) {
        this.title = title;
        this.author = author;
        this.abstractText = abstractText;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public java.util.Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(java.util.Date publishDate) {
        this.publishDate = publishDate;
    }
}