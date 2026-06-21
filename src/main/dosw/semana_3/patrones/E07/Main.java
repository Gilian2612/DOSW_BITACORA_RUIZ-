package E07;
public class Main {
    public static void main(String[] args) {
        System.out.println(" E07: Flujo de Aprobacion de Documentos \n");
        Document doc1 = new Document("Contrato de Servicios");
        System.out.println("Estado: " + doc1.getStateName());
        new AutorHandler().handle(doc1);
        System.out.println("Estado final: " + doc1.getStateName());
        System.out.println();
        Document doc2 = new Document("Clausula Ilegal");
        System.out.println("Estado: " + doc2.getStateName());
        new LiderHandler().handle(doc2);
        System.out.println("Estado final: " + doc2.getStateName());
    }
}
