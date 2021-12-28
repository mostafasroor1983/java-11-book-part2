package six;

interface Intelligence {
  int cunning();
}

class Canine implements Intelligence {
  @Override
  public int cunning() {
    return 500;
  }

  void howl() {
    System.out.print("Woof!");
  }
}

public class Wolf extends Canine {
  @Override
  public int cunning() {
    return Integer.MAX_VALUE;
  }

  @Override
  void howl() {
    System.out.print("Howl!");
  }
}

/*
public class Dog extends Canine {
  @Override
  public boolean playFetch() {
    return true;
  } // DOES NOT COMPILE

  @Override
  void howl(int timeOfDay) {
  } // DOES  NOT COMPILE
}*/
