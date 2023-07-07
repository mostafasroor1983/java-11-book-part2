package one;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example1 {

    public static void write1() throws IOException {
        var writer = Files.newBufferedWriter(Path.of("test.txt"));
        try (writer) { // DOES NOT COMPILE, because it is not effectively final
            writer.append("Welcome to the zoo!");
        }
        //writer = null;//it is not effectively final
    }

    public static void write2() throws IOException {
        var writer = Files.newBufferedWriter(Path.of("test.txt"));
        writer.append("This write is permitted but a really bad idea!");
        try (writer) {
            writer.append("Welcome to the zoo!");
        }

        //java.io.IOException: Stream closed
        writer.append("This write will fail!"); // IOException because writer is closed here
    }

    public static void main(String[] args) throws IOException {
        write2();
    }
}
