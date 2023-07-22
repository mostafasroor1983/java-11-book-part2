package command.injection;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CommandInjectionExample {
    public static void main(String[] args) throws IOException {
        //Console console = System.console();
        String dirName = "files";  //console.readLine();
        //String dirName = ".";
        //String dirName = "chapter-11";

        if (dirName.equals("files") || dirName.equals("chapter-11")) {
            Path path = Paths.get(dirName);
            try (Stream<Path> stream = Files.walk(path)) {
                stream.filter(p -> p.toString().endsWith(".txt"))
                        .forEach(System.out::println);
            }
        } else {
            throw new RuntimeException("The input you have entered not valid.");
        }
    }
}
