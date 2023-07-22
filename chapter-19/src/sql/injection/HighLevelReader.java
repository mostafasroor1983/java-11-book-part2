package sql.injection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HighLevelReader {
    public static void main(String[] args) {

        //Wrapping low-level FileReader with high-level BufferedReader
        //Character streams are butter than Byte streams in handling textual files, it is more convenient
        //and improve the performance.
        try (var reader = new BufferedReader(new FileReader("test3.txt"))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
