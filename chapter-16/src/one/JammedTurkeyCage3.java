package one;

public class JammedTurkeyCage3 implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage3 t = new JammedTurkeyCage3()) {
            //java.lang.RuntimeException: Turkeys ran off
            throw new RuntimeException("Turkeys ran off");

            //Suppressed: java.lang.IllegalStateException: Cage door does not close
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}