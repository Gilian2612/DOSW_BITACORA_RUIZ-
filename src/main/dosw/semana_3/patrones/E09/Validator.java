package E09;
public abstract class Validator {
    private Validator next;
    public Validator setNext(Validator next) {
        this.next = next;
        return next;
    }
    public void validate(String user) {
        check(user);
        if (next != null) next.validate(user);
    }
    abstract void check(String user);
}
