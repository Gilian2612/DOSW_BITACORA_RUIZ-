package E09;

public interface AuthStrategy {
    boolean authenticate(String user, String credential);
}
