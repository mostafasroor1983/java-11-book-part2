package abstractpkg;

abstract class Bear {
    public Bear() {
        System.out.println(chew()); // Does this compile?
    }

    abstract CharSequence chew();
}

public class Panda extends Bear {
    public static void main(String[] args) {
        new Panda();
    }

    String chew() {
        return "yummy!";
    }
}

/* abstract final class Tortoise { // DOES NOT COMPILE
   public abstract final void walk(); // DOES NOT  COMPILE
 }*/
