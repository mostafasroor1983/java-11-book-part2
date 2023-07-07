package one;

public class JammedTurkeyCage implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }


    public static void main(String[] args) {
        try (var t = new JammedTurkeyCage()) {
            System.out.println("Put turkeys in");
            //To catch the IllegalStateException in close function
        } /*catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }*/
    }
}