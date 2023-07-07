package fourth;

import java.util.Locale;

public class LocalExample2 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // en_US
        Locale locale = new Locale("fr");
        Locale.setDefault(locale); // change the  default
        System.out.println(Locale.getDefault()); // fr
    }
}
