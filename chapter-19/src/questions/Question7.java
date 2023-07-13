package questions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Question7 {
    public static String pullBytes(InputStream in, int count) throws IOException {
        in.mark(count);
        var sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append((char) in.read());
        in.reset();
        in.skip(1);
        sb.append((char) in.read());
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(pullBytes(new BufferedInputStream(
                new FileInputStream("test.txt")), 3));
    }
}
