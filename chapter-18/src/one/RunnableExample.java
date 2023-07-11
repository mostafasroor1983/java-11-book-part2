package one;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable sloth = () -> System.out.println("Hello World");
        Runnable snake = () -> {
            int i = 10;
            i++;
        };
        Runnable beaver = () -> {
            return;
        };
        Runnable coyote = () -> {
        };

        new Thread(sloth).start();

        //Because it returns data
        // Runnable capybara = () -> "";                // DOES NOT COMPILE
        // Runnable Hippopotamus = () -> 5;             // DOES NOT COMPILE
        // Runnable emu = () -> {return new Object();}; // DOES NOT COMPILE
    }
}
