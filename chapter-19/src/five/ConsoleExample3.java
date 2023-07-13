package five;

import java.io.Console;
import java.util.Locale;

public class ConsoleExample3 {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null)
            console.writer().format(new Locale("fr", "CA"), "Hello World");
    }
}
