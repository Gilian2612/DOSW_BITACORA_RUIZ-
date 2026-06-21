package E07;
public class InReviewState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("  [State] EN_REVISION -> APROBADO");
        doc.setState(new ApprovedState());
    }
    @Override
    public void reject(Document doc) {
        System.out.println("  [State] EN_REVISION -> RECHAZADO");
    }
    @Override
    public String getName() { return "EN_REVISION"; }
}
