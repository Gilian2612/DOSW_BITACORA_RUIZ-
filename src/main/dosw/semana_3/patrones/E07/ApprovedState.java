package E07;
public class ApprovedState implements DocumentState {
    @Override
    public void approve(Document doc) { System.out.println("  [State] Ya esta APROBADO."); }
    @Override
    public void reject(Document doc) { System.out.println("  [State] Ya esta APROBADO, no se puede rechazar."); }
    @Override
    public String getName() { return "APROBADO"; }
}
