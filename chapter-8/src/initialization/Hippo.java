package initialization;

class Animal {
  static {
    System.out.print("A");
  }

  {
    System.out.print("D");
  }
}

public class Hippo extends Animal {
  static {
    System.out.print("B");
  }

  {
    System.out.print("E");
  }

  public static void main(String[] grass) {
    System.out.print("C");
    new Hippo();
    new Hippo();
    //new Hippo();
  }
}