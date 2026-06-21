package E09;
public class GoogleStrategy implements AuthStrategy {
    @Override
    public boolean authenticate(String user, String credential) {
        System.out.println("[Strategy] Autenticando " + user + " con Google OAuth");
        return credential.equals("google-token-valid");
    }
}
