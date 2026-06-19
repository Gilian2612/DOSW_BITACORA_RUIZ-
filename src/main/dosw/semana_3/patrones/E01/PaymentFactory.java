package semana_3.patrones.E01;

public interface PaymentFactory {
    PaymentStrategy create(String type);
}
