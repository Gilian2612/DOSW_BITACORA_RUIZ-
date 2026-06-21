package E01;

public interface PaymentFactory {
    PaymentStrategy create(String type);
}
