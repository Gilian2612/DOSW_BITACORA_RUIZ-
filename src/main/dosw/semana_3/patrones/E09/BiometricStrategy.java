package E09;

public class BiometricStrategy implements AuthStrategy {
    @Override
    public boolean authenticate(String user, String credential) {
        System.out.println("[Strategy] Autenticando " + user + " con biometria");
        return credential.equals("huella-ok");
    }
}
