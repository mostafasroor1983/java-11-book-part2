package fourth;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalExample3 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        System.out.println(numberFormat.format(12.76));

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyInstance.format(12.76));

        NumberFormat percentInstance = NumberFormat.getPercentInstance(locale);
        System.out.println(percentInstance.format(12.76));

        NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
        System.out.println(integerInstance.format(12.76));

    }
}
