package privateMethodInterface;

public interface Swim {
  // can be called in private method, default method, private static method, public static method
  private static void breathe(String type) {
    System.out.println("Inhale");
    System.out.println("Performing stroke: " + type);
    System.out.println("Exhale");
  }

  //implicitly public
  static void butterfly() {
    breathe("butterfly");
  }

  private static void freestyle() {
    breathe("freestyle");
  }

  default void backstroke() {
    breathe("backstroke");
  }

  private void breaststroke() {
    breathe("breaststroke");
  }
}