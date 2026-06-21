package E01;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Pago con PayPal por $" + amount);
    }
}
