import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    public static void main(String[] a) {
        FileReader reader = null;
        try {
            read();
        } catch (IOException e) {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException inner) {
            }
        }
    }

    private static void read() throws FileNotFoundException {
        // CODE GOES HERE
        throw new FileNotFoundException();
    }

}
