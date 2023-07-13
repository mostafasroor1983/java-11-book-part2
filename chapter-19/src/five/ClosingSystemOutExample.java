package five;

public class ClosingSystemOutExample {
    public static void main(String[] args) {
        try (var out = System.out) {
        }
        System.out.println("Hello");

        try (var err = System.err) {
        }
        System.err.println("Hello");
    }
}
