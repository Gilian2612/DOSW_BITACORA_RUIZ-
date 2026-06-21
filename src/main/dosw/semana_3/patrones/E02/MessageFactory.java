package E02;
public interface MessageFactory {
    Main.Message build(Main.OrderEvent event);
}
