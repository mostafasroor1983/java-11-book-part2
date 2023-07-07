package one;

public class CannotSwimException extends Exception {
    public CannotSwimException() {
        super(); // Optional, compiler will insert automatically
    }

    public CannotSwimException(Exception e) {
        super(e);
    }

    public CannotSwimException(String message) {
        super(message);
    }
}