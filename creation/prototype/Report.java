package creation.prototype;



public class Report implements IDocument {
    private String content;
    private String author;

    public Report(String content, String author) {
        this.content = content;
        this.author = author;
    }

    @Override
    public IDocument clone() {
        return new Report(this.content, this.author);
    }

    @Override
    public void print() {
        System.out.println("Report [content=" + content + ", author=" + author + "]");
    }

    // Getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
