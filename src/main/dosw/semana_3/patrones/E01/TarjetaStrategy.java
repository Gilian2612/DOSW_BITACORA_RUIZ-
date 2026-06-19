package semana_3.patrones.E01;

public class TarjetaStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Pago con Tarjeta por $" + amount);
    }
}
