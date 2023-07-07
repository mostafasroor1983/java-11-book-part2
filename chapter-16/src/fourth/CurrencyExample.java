package fourth;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.FormatStyle.SHORT;

public class CurrencyExample {

    public static void printCurrency(Locale locale, double money) {
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
                + ", " + locale.getDisplayLanguage());
    }

    public static void main(String[] args) {
        var spain = new Locale("es", "ES");
        var money = 1.23;

        // Print with default locale
        Locale.setDefault(new Locale("en", "US"));
        printCurrency(spain, money); // $1.23, Spanish

        // Print with default locale and selected locale display
        Locale.setDefault(Locale.Category.DISPLAY, spain);
        printCurrency(spain, money); // $1.23, espaÑol

        // Print with default locale and selected locale format
        Locale.setDefault(Locale.Category.FORMAT, spain);
        printCurrency(spain, money); // 1,23 €, espaÑol
    }
}
