package constructors.superConst;

public class FinalFields {

    // It can be initialized one time either on declaration, or in static initializer
    private static final String b;
    private static final int c;

    static {
        b = "MOSTAFA";
        c = 1;
    }

    // It can be initialized one time either on declaration, or in instance initializer or in constructor
    private final String a;
    private final int d;

    FinalFields() {
        d = c;
        a = b;
        //d = ++c;
    }
}
