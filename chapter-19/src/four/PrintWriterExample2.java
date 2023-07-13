package four;

import java.io.*;

public class PrintWriterExample2 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter out = new PrintWriter("zoo.log")) {
            out.write(String.valueOf(5));              // Writer method
            out.print(5);                                 // PrintWriter method
            var a = new Chimpanzee();
            out.write(a == null ? "null" : a.toString()); // Writer method
            out.print(a);                                 // PrintWriter method
        }

        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.lineSeparator());

    }
}
