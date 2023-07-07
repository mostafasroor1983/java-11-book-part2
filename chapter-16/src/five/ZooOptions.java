package five;

import java.util.Properties;

public class ZooOptions {
    public static void main(String[] args) {
        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel")); // null
        System.out.println(props.getProperty("camel", "Bob")); //Bob
        System.out.println(props.getProperty("name") + " open at " + props.getProperty("open"));
    }
}
