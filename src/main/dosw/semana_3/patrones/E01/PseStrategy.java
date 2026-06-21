package E01;

public class PseStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Pago con PSE por $" + amount);
    }
}
