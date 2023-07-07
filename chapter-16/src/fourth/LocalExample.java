package fourth;

import java.util.Locale;

public class LocalExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayLanguage());

        //creating Locale
        //1st way
        System.out.println(Locale.GERMAN);  // de
        System.out.println(Locale.GERMANY); // de_DE

        //2nd way
        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN

        //3rd way is more flexible.
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
    }
}
