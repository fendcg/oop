public class News {
    private String headline;
    private String content;
    private java.util.Date publishDate;


    public News(String headline, String content, java.util.Date publishDate) {
        this.headline = headline;
        this.content = content;
        this.publishDate = publishDate;
    }


    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public java.util.Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(java.util.Date publishDate) {
        this.publishDate = publishDate;
    }
}