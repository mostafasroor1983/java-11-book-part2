package tryresources;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        readFile();
    }

    // the old fashion code to close and release resources
    static void readFile() {
        FileInputStream is = null;
        try {
            is = new FileInputStream("file.txt");
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

}
