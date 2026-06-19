package semana_3.patrones.E02;

public class EmailMessageFactory implements MessageFactory {
    @Override
    public Main.Message build(Main.OrderEvent event) {
        String html = "<h1>Pedido " + event.orderId + "</h1>"
                    + "<p>Estado: " + event.previousState + " -> " + event.newState + "</p>";
        return new Main.Message(html, "HTML");
    }
}
