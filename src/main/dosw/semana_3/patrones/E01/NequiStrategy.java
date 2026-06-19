package semana_3.patrones.E01;

public class NequiStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Pago con Nequi por $" + amount);
    }
}
