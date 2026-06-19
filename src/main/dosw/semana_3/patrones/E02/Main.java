package semana_3.patrones.E02;
import java.util.ArrayList;
import java.util.List;

public class Main {

/**
 * clases estaticas son clases auxiliares del ejercicio 
 */

    public static class OrderEvent {
        public String orderId;
        public String previousState;
        public String newState;

        public OrderEvent(String orderId, String previousState, String newState) {
            this.orderId = orderId;
            this.previousState = previousState;
            this.newState = newState;
        }
    }

    public static class Message {
        public String content;
        public String format;

        public Message(String content, String format) {
            this.content = content;
            this.format = format;
        }
    }

    public static class Pedido {
        private String id;
        private String estado;
        private List<NotificationObserver> observers = new ArrayList<>();

        public Pedido(String id) {
            this.id = id;
            this.estado = "PENDIENTE";
        }

        public void addObserver(NotificationObserver observer) {
            observers.add(observer);
        }

        public void cambiarEstado(String nuevoEstado) {
            OrderEvent event = new OrderEvent(id, estado, nuevoEstado);
            this.estado = nuevoEstado;
            for (NotificationObserver obs : observers) {
                obs.notify(event);
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("PEDIDO ORD-001 (Email + SMS + Push) ");
        Pedido pedido1 = new Pedido("ORD-001");
        pedido1.addObserver(new EmailNotifier());
        pedido1.addObserver(new SmsNotifier());
        pedido1.addObserver(new PushNotifier());

        pedido1.cambiarEstado("ENVIADO");
        System.out.println("-----------------------------");
        pedido1.cambiarEstado("ENTREGADO");

        System.out.println("\nPEDIDO ORD-002 (solo SMS) ");
        Pedido pedido2 = new Pedido("ORD-002");
        pedido2.addObserver(new SmsNotifier());

        pedido2.cambiarEstado("ENVIADO");
        System.out.println("-----------------------------");
        pedido2.cambiarEstado("ENTREGADO");
    }
}
