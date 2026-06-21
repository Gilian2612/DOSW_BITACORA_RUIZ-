package E07;

public class LiderHandler extends DocumentHandler {
    @Override
    boolean canHandle(Document doc) { return doc.getStateName().equals("EN_REVISION"); }
    @Override
    void process(Document doc) {
        System.out.println("[Chain] LiderHandler rechaza: " + doc.getTitle());
        doc.reject();
    }
}
