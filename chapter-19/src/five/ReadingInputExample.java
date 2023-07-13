package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInputExample {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String userInput = reader.readLine();
            System.out.println("You entered: " + userInput);
            if (userInput.equals("exit"))
                System.exit(0);
        }
    }
}
