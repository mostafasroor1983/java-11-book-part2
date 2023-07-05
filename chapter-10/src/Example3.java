public class Example3 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            // compile well because suppressed by exception in finally block
            throw new Exception();
        } finally {
            // the return in finally block will interrupt/suppress any return from try and block
            // the throwing exception in finally block will interrupt/suppress any exception from catch block
            throw new IllegalStateException();
        }
    }
}
