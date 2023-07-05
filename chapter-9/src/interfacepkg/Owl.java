package interfacepkg;

interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly {
}

public class Owl implements HasBigEyes {
    public int hunt() {
        return 5;
    }

    public void flap() {
        System.out.println("Flap!");
    }
}