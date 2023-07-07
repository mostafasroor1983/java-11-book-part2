package one;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileReader implements AutoCloseable {
    private String tag;

    public MyFileReader(String tag) {
        this.tag = tag;
    }

    @Override
    public void close() {
        System.out.println("Closed: " + tag);
    }


    public static void relax() {
        final var bookReader = new MyFileReader("4");
        MyFileReader movieReader = new MyFileReader("5"); //effectively final
        try (bookReader;
             var tvReader = new MyFileReader("6");
             movieReader) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }
    }


    public static void main(String[] args) {
        //try (String reptile = "lizard") {} // compiler error

        try (var bookReader = new MyFileReader("monkey");
             var bookReader2 = new MyFileReader("dog")) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }

        relax();
    }
}
