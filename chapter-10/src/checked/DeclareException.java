package checked;

import java.io.IOException;

public class DeclareException {
    public static void main(String[] args) throws IOException {
        fall(11);
    }

    static void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
        System.out.println(distance);
    }

}
