package checked;

import java.io.IOException;

public class DeclareException2 {
    public static void main(String[] args) throws IOException {
        var distance = 11;
        try {
            fall(distance);
        } finally {
            System.out.println(distance);
        }
    }

    static void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

}
