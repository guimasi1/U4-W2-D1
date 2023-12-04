package es3;

public class BancaException extends Exception {
    String message;
    public BancaException(String message) {
        super(message);
        this.message = message;
    }
}
