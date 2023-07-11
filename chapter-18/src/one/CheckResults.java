package one;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 5000000; i++) {
                CheckResults.counter++;
                //System.out.println(CheckResults.counter);
            }
        }).start();

        while (CheckResults.counter < 100000) {
            System.out.println("Not reached yet : " + CheckResults.counter);
            Thread.sleep(1000);
        }

        System.out.println("Reached! "+ CheckResults.counter);
    }
}