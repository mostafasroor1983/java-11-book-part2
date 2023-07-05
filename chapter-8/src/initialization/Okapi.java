package initialization;

class Mammal {
    static {
        System.out.print("M");
    }

    {
        System.out.print("N");
    }

    public Mammal() {
        System.out.print("L");
    }
}

class GiraffeFamily extends Mammal {
    static {
        System.out.print("A");
    }

    {
        System.out.print("B");
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C");
    }

    public GiraffeFamily() {
        System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.print("E");
    }
}

public class Okapi extends GiraffeFamily {
    static {
        System.out.print("F");
    }

    {
        System.out.print("H");
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.print("G");
    }

    public static void main(String[] grass) {
        new Okapi(1);
        //System.out.println();
        //new Okapi(2);
    }
}
