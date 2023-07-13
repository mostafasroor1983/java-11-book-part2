package four;

public class FormatExample {
    public static void main(String[] args) {
        String name = "Lindsey";
        int orderId = 5;

        // Both print: Hello Lindsey, order 5 is ready
        System.out.format("Hello " + name + ", order " + orderId + " is ready");
        System.out.println();
        System.out.format("Hello %s,%n order %d is ready", name, orderId);
        System.out.println();
        System.out.printf("Hello %s,%n order %d is ready and the total cost is %.1f",
                name, orderId, 15.54F);

        System.out.println();
        name = "James";
        double score = 90.25;
        int total = 100;
        System.out.format("%s:%n Score: %.2f out of %d", name,
                score, total);

        var pi = 3.14159265359;
        System.out.println();
        System.out.format("[%f]", pi); // [3.141593]
        System.out.println();
        System.out.format("[%12.8f]", pi); // [3.14159265]
        System.out.println();
        System.out.format("[%012f]", pi); //[00003.141593]
        System.out.println();
        System.out.format("[%12.2f]", pi); // [3.14]
        System.out.println();
        System.out.format("[%.3f]", pi); // [3.142]
    }
}
