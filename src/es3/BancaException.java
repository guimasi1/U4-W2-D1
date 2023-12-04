package es3;

public class BankException extends Exception {
    String message;
    public BankException(String message) {
        super(message);
    }
}
