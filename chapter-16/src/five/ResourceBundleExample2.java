package five;


import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample2 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(rb.getString("hello"));   //Hello
        System.out.print(". ");
        System.out.print(rb.getString("name"));   //Vancouver Zoo
        System.out.print(" ");
        System.out.print(rb.getString("open"));   //The zoo is open
        System.out.print(" ");
        System.out.print(rb.getString("visitors"));//Canada visitors

        //property "close" is not found in any resource bundle: MissingResourceException
        //System.out.print(rb.getString("close"));
    }
}
