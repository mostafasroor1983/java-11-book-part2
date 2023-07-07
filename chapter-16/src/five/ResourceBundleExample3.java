package five;


import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample3 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        String format = rb.getString("helloByName");
        System.out.println(MessageFormat.format(format,"Mostafa", "Srour"));
    }
}
