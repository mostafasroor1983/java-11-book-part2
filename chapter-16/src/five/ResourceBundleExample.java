package five;


import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello")
                + ", " + rb.getString("open"));
    }

    public static void printAll(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        rb.keySet().stream()
                .map(k -> k + ":" + rb.getString(k))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");

        printWelcomeMessage(us);     // Hello, The zoo is open
        printWelcomeMessage(france); // Bonjour, Le zoo est ouvert

        System.out.println("-------------------------");
        printAll(us);
        printAll(france);
    }
}
