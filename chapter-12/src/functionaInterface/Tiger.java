package functionaInterface;


// functional interface because it includes just one abstract method
@FunctionalInterface
interface Sprint {
  void sprint(int speed);

  default int getZzz() {
    return 1;
  }
}

@FunctionalInterface
interface Dash extends Sprint {
}

interface Skip extends Sprint {
  void skip();
}

interface Sleep {
  private void snore() {
  }

  default int getZzz() {
    return 1;
  }
}

@FunctionalInterface
interface Climb {
  static int getBackUp() {
    return 100;
  }

  private static boolean checkHeight() {
    return true;
  }

  void reach();

  default void fall() {
  }
}

public class Tiger implements Sprint {
  public static void main(String[] args) {
    Sprint sprint = i -> System.out.println(" Lambda is printing first " + i);
    sprint.sprint(1);
  }

  public void sprint(int speed) {
    System.out.println("Animal is sprinting fast! " + speed);
  }
}
