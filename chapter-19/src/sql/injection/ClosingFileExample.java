package sql.injection;

import java.io.*;

public class ClosingFileExample {

    public static void main(String[] args) throws IOException {
        try (var fis = new FileOutputStream("test3.txt"); // Unnecessary
             var bis = new BufferedOutputStream(fis);
             var ois = new ObjectOutputStream(bis)) {
            ois.writeObject("Hello");
        }

        try (var ois = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("test3.txt")))) {
            ois.writeObject("Hello");
        }
    }
}
