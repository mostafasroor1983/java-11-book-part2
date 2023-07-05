package questions;

import java.io.IOException;

public class Question17 {
    static void rollOut() throws ClassCastException {
    }

    public static void transform(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | NullPointerException d) {
        }
    }

    public static void main(String[] args) {
        transform("hello");
    }
}
