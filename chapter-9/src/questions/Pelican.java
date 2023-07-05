package questions;

abstract class Bird {
    protected Bird() {
        System.out.print("Wow- ");
    }

    private final void fly() {
        System.out.println("Bird");
    }
}

public class Pelican extends Bird {
    public Pelican() {
        System.out.print("Oh-");
    }

    public static void main(String[] args) {
        var chirp = new Pelican();
        chirp.fly();
    }

    protected void fly() {
        System.out.println("Pelican");
    }
}
