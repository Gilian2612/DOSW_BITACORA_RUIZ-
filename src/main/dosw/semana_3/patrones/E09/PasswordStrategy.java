package E09;
public class PasswordStrategy implements AuthStrategy {
    @Override
    public boolean authenticate(String user, String credential) {
        System.out.println("[Strategy] Autenticando " + user + " con usuario/contrasena");
        return credential.equals("password123");
    }
}
