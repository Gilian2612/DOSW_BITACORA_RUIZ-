package E07;
public class AutorHandler extends DocumentHandler {
    @Override
    boolean canHandle(Document doc) { return doc.getStateName().equals("EN_REVISION"); }
    @Override
    void process(Document doc) {
        System.out.println("[Chain] AutorHandler aprueba: " + doc.getTitle());
        doc.approve();
    }
}
