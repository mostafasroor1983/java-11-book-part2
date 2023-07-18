package four;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesMethodsExample1 {
    public static void main(String[] args) throws URISyntaxException {
        //This method does not throw an exception if the file does not exist,

        var b = Files.exists(Paths.get(new URI("file:///Users/mostafasrour")));
        System.out.println("Path " + (b ? "Exists" : "Missing"));
        System.out.println("------------------------------------");

        var b1 = Files.exists(Paths.get("files/test.txt"));
        System.out.println("Path " + (b1 ? "Exists" : "Missing"));

        System.out.println("------------------------------------");
        var b2 = Files.exists(Paths.get("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part2"));
        System.out.println("Path " + (b2 ? "Exists" : "Missing"));

        System.out.println("------------------------------------");
        var b3 = Files.exists(Paths.get("/", "Users", "mostafasrour", "Desktop",
                "projects", "gtihub", "java-11-book-part3"));
        System.out.println("Path " + (b3 ? "Exists" : "Missing"));
    }
}
