package abstractpkg;

abstract class Whale {
    //private abstract void sing(); // DOES NOT COMPILE, because it is a private
}

public class HumpbackWhale extends Whale {
    void sing() {
        System.out.println("Humpback whale is singing");
    }

    public static void main(String[] args) {
        new HumpbackWhale().sing();
    }
}