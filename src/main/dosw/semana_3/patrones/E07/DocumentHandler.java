package E07;
public abstract class DocumentHandler {
    private DocumentHandler next;
    public DocumentHandler setNext(DocumentHandler next) {
        this.next = next;
        return next;
    }
    public void handle(Document doc) {
        if (canHandle(doc)) process(doc);
        else if (next != null) next.handle(doc);
    }
    abstract boolean canHandle(Document doc);
    abstract void process(Document doc);
}
