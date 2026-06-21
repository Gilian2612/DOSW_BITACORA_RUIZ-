package E09;

public class CredentialValidator extends Validator {
    @Override
    void check(String user) {
        System.out.println("  [Chain] Validando credenciales de " + user + " -> OK");
    }
}
