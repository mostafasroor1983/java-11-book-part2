package interfacepkg;

// interface can't be instantiated
// access modifier can be public or package-private
// abstract is implicit modifier
public abstract interface CanBurrow {
    // public static final is implicit modifier
    public static final int NUM_DEPTH = 10;

    // access modifier can be public or package-private
    public abstract Float getSpeed(int age);

    static String func() {
        return "";
    }
}
