package fourth;

import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatExample {
    public static void main(String[] args) {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var defaultC = NumberFormat.getCurrencyInstance();
        System.out.println(defaultC.format(attendeesPerMonth));

        var us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));

        var gr = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));

        var ca = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));

    }
}
