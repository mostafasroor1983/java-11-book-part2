package two;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FlushExample {

    public static void main(String[] args) throws IOException {
        try (var fos = new FileOutputStream("test.txt")) {
            for (int i = 0; i < 1000; i++) {
                fos.write('a');
                if (i % 100 == 0) {
                    fos.flush();
                }
            }
        }
    }
}
