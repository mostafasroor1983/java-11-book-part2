package unchecked;


class P {
}

class S extends P {
}

public class ClassCastException {
  public static void main(String[] args) {
    String type = "moose";
    //Integer number = (Integer) type; // DOES NOT COMPILE

    P p = new P();
    S s = (S) p;                       // ClassCastException

    Object obj = "1";                  // 1
    Integer number = (Integer) obj;    // ClassCastException : try to cast String to Integer
  }
}
