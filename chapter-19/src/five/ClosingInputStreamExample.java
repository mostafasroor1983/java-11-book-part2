package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingInputStreamExample {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        try (reader) {
        }

        // throw IOException because the stream is closed.
        String data = reader.readLine();
    }
}
