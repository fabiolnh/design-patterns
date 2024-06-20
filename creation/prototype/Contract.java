package creation.prototype;

public class Contract implements IDocument {
    private String content;
    private String contractor;

    public Contract(String content, String contractor) {
        this.content = content;
        this.contractor = contractor;
    }

    @Override
    public IDocument clone() {
        return new Contract(this.content, this.contractor);
    }

    @Override
    public void print() {
        System.out.println("Contract [content=" + content + ", contractor=" + contractor + "]");
    }

    // Getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }
}