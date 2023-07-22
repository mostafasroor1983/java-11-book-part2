package sql.injection;

import java.io.*;

public class HighLevelInputStream {
    public static void main(String[] args) {
        try (var reader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("test3.txt")))) {
            System.out.println(reader.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
