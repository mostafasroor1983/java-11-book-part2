package four;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesMethodsExample10 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("test2.txt");
        try (var in = Files.newBufferedReader(path);
             var out = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String line = "";
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
                out.flush();
            }
        }

    }
}
