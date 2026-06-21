package E07;
public class Document {
    private String title;
    private DocumentState state;
    public Document(String title) {
        this.title = title;
        this.state = new InReviewState();
    }
    public void approve() { state.approve(this); }
    public void reject() { state.reject(this); }
    public void setState(DocumentState state) { this.state = state; }
    public String getTitle() { return title; }
    public String getStateName() { return state.getName(); }
}
