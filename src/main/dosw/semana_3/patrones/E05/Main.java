package E05;
public class Main {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade();
        System.out.println(" E05: Integracion con Sistema Bancario Antiguo \n");
        facade.verificarFondos(500.00);
        facade.procesarPago(1250.75);
    }
}
