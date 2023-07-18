package four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesMethodsExample8 {
    public static void main(String[] args) throws IOException {
        //An atomic move is one in which a file is moved within the file
        //system as a single indivisible operation.
        //It is very important in multithreading concurrent processing.
        Files.move(Path.of("zoo.log"), Path.of("files/zoo.log"),
                StandardCopyOption.ATOMIC_MOVE);
        Files.move(Path.of("files/zoo.log"), Path.of("zoo.log"),
                StandardCopyOption.ATOMIC_MOVE);

        //StandardCopyOption.ATOMIC_MOVE is not applicable in Files.copy : UnsupportedOperationException
        Files.copy(Path.of("zoo.log"), Path.of("files/zoo.log"),
                StandardCopyOption.ATOMIC_MOVE);

    }
}
