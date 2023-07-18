package four;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesMethodsExample2 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        // Create a base URI pointing to the current working directory
        URI baseUri = new URI("file:///Users/mostafasrour/Desktop/projects/gtihub/java-11-book-part2/");
        boolean b11 = Files.isSameFile(Path.of(baseUri.resolve("test2.txt")),
                Path.of("test2.txt"));
        System.out.println("Is same files: " + (b11 ? "Yes" : "No"));

        //If the two path objects are equal, in terms of equals(), then
        //the method will just return true without checking whether the
        //file exists.
        System.out.println("---------------");
        boolean b12 = Files.isSameFile(Path.of("a/b/c"), Path.of("a/b/c"));
        System.out.println("Is same files: " + (b12 ? "Yes" : "No"));

    }
}
