package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Question18 {
    public static void main(String[] args) throws IOException {
        var x = Path.of("/Users/mostafasrour/..");
        System.out.println(x.toRealPath().getParent());
        //The toRealPath() method will simplify the path to /Users and throw
        //an exception if it does not exist

        //Files.walk() does not follow symbolic links by default. Only if the
        //FOLLOW_LINKS option is provided and a cycle is encountered will the
        //exception be thrown.
        Files.walk(x.toRealPath().getParent()) // u1
                .map(p -> p.toAbsolutePath().toString()) // u2
                .filter(s -> s.endsWith(".java")) // u3
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
