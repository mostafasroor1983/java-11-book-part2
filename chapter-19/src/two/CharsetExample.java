package two;

import java.nio.charset.Charset;

public class CharsetExample {
    public static void main(String[] args) {
        Charset usAsciiCharset = Charset.forName("US-ASCII");
        Charset utf8Charset = Charset.forName("UTF-8");
        Charset utf16Charset = Charset.forName("UTF-16");
        System.out.println(usAsciiCharset);
        System.out.println(utf8Charset);
        System.out.println(utf16Charset);
    }
}
