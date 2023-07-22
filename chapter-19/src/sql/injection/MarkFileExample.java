package sql.injection;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkFileExample {
    static void readData(InputStream is) throws IOException {
        System.out.print((char) is.read()); // L
        if (is.markSupported()) {
            //we expect to call reset() after at most 100 bytes.
            is.mark(1); // Marks up to 100 bytes
            System.out.print((char) is.read()); // I
            System.out.print((char) is.read()); // O
            is.reset(); // Resets stream to position before I
        }
        System.out.print((char) is.read()); // I
        is.skip(1L);
        System.out.print((char) is.read()); // N
        //System.out.print((char) is.read()); // N
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        readData(new FileInputStream("test.txt"));
        System.out.println("--------------------------");
        readData(new BufferedInputStream(new FileInputStream("test.txt")));
    }
}
