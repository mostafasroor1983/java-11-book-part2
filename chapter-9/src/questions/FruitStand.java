package questions;

interface Apple {
}

interface Orange {
}

class Gala implements Apple {
}

class Tangerine implements Orange {
}

final class Citrus extends Tangerine {
}

public class FruitStand {
  public static void main(String... farm) {
    Gala g = new Gala();
    Tangerine t = new Tangerine();
    Citrus c = new Citrus();

    // unrelated classes
    //System.out.print(t instanceof Gala);

    // compiler limitation around casting interface
    System.out.print(c instanceof Tangerine); //true
    System.out.print(g instanceof Apple);    // true
    System.out.print(t instanceof Apple);    // false

    // because Citrus is final class and unrelated
    //System.out.print(c instanceof Apple);
  }
}