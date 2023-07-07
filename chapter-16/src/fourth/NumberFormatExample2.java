package fourth;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatExample2 {
    public static void main(String[] args) throws ParseException {
        String s = "40.45";

        //In the United States, a dot ( .) is part of a number, and the
        // number is parsed how you might expect.
        //France does not use a decimal point to separate numbers.
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s)); // 40.45

        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); // 40

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double) cf.parse(income);
        System.out.println(value); // 92807.99
    }
}
