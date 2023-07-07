package one;

public class ZooMaintenance {
    public static void main(String[] args) {
        open();
        //close();
    }

    public static void open() {
        try {
            throw new Exception();
        } catch (Exception e) {
            // Handles exception
        }
    }

    public static void close() throws Exception { // Declares exceptions
        throw new Exception();
    }
}