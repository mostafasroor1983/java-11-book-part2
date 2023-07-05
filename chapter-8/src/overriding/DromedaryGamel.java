package overriding;

class Gamel {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

public class DromedaryGamel extends Gamel {

    // because private method can't be overridden or inherited so this is a new method
    // defined in the child class and overriding rules don't apply on it.
    private int getNumberOfHumps() {
        return 1;
    }
}