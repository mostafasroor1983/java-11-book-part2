package finalmethod;

class Bird {
    public final static void flyAway() {
    }

    public final boolean hasFeathers() {
        return true;
    }
}

public class Penguin extends Bird {
    // final method can't be hidden
 /* public final static void flyAway() {
  }*/ // DOES NOT  COMPILE

    // final method can't be overridden
    /* public *//*final*//* boolean hasFeathers() { // DOES NOT COMPILE
    return false;
  }*/
}
