package E09;
public class Main {
    public static void main(String[] args) {
        System.out.println(" E09: Sistema de Autenticacion Empresarial \n");
        CredentialValidator cred = new CredentialValidator();
        PermissionValidator perm = new PermissionValidator();
        LocationValidator loc = new LocationValidator();
        cred.setNext(perm).setNext(loc);
        AuthStrategy strategy = new PasswordStrategy();
        boolean auth = strategy.authenticate("William", "password123");
        if (auth) {
            System.out.println("Autenticacion exitosa, validando acceso...");
            cred.validate("William");
            System.out.println("Acceso concedido.\n");
        }
        strategy = new GoogleStrategy();
        auth = strategy.authenticate("Carlos", "google-token-valid");
        if (auth) {
            System.out.println("Autenticacion exitosa, validando acceso...");
            cred.validate("Carlos");
            System.out.println("Acceso concedido.\n");
        }
        strategy = new BiometricStrategy();
        auth = strategy.authenticate("Andrea", "huella-fail");
        System.out.println("Resultado: " + (auth ? "exitosa" : "fallida, acceso denegado"));
    }
}