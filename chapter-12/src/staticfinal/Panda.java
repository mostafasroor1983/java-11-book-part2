package staticfinal;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
    //static final double height; // DOES NOT COMPILE

    static {
        bamboo = 5;
      //  height = 5.5D;
    }
}
