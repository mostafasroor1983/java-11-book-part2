package four;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethodsExample11 {
    public static void main(String[] args) throws IOException {
        Path inPath = Path.of("test2.txt");
        Path outPath = Path.of("test3.txt");
        try (var reader = Files.newBufferedReader(inPath);
             var writer = Files.newBufferedWriter(outPath)) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
        }

    }
}
