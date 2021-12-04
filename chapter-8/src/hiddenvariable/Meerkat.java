package hiddenvariable;

class Carnivore {
  protected boolean hasFur = false;
  protected static boolean hasFeet = false;
}

public class Meerkat extends Carnivore {
  protected boolean hasFur = true;
  protected static boolean hasFeet = true;

  public static void main(String[] args) {
    Meerkat m = new Meerkat();
    Carnivore c = m;
    // hiding hasFeet variable in parent
    System.out.println(hasFeet);  // true
    System.out.println(m.hasFeet);// true
    System.out.println(c.hasFeet);// false
    System.out.println(m.hasFur); // true: refer by reference type : polymorphism not applied on variable level
    System.out.println(c.hasFur); // false: refer by reference type : polymorphism not applied on variable level
  }
}