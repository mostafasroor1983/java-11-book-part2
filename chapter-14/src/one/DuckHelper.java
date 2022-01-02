package one;

public class DuckHelper {
  // we can use functional interface as parameter
  public static void teacher(String name, LearnToSpeak trainer) {
    // exercise patience
    trainer.speak(name);
  }
}