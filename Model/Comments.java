public class Comments {
    private String username;
    private String message;
    private java.util.Date timestamp;

    public Comments(String username, String message, java.util.Date timestamp) {
        this.username = username;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public java.util.Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormattedComment() {
        return "[" + username + "] " + message + " (" + timestamp + ")";
    }
}