package one;

public class DuckHelper {
    // we can use functional interface as parameter
    public static void teacher(String name, LearnToSpeak trainer) {
        // exercise patience
        trainer.speak(name);
    }

    public static void main(String[] args) {
        String name = "Mostafa";
        LearnToSpeak trainer = nm -> System.out.println("Hello, "+ nm);
        teacher(name, trainer);
    }
}