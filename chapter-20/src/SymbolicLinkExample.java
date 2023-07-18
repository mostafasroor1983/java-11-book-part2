import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class SymbolicLinkExample {
    public static void main(String[] args) {
        //create a special type of file system entry that acts as a pointer or reference to another file or directory
        Path targetPath = Paths.get("link");
        Path linkPath = Paths.get("files/link.txt");
        try {
            Files.createSymbolicLink(linkPath, targetPath);
            System.out.println("Symbolic link created successfully.");
        } catch (IOException e) {
            System.out.println("Failed to create symbolic link: " + e.getMessage());
        }
    }
}