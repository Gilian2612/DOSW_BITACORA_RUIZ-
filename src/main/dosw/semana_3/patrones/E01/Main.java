package E01;

public class Main {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        System.out.println("USUARIO COL");
        PaymentFactory factory = new ColombiaPaymentFactory();

        checkout.setStrategy(factory.create("PSE"));
        checkout.executePayment(150000);

        checkout.setStrategy(factory.create("NEQUI"));
        checkout.executePayment(75000);
        System.out.println("-----------------------------");
        System.out.println("\nUSUARIO USA");
        factory = new UsaPaymentFactory();

        checkout.setStrategy(factory.create("PAYPAL"));
        checkout.executePayment(99.99);

        checkout.setStrategy(factory.create("STRIPE"));
        checkout.executePayment(249.50);
    }
}
