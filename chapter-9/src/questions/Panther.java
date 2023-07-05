package questions;

import java.util.ArrayList;
import java.util.List;

interface Walk {
    public List move();
}

interface Run extends Walk {
    public ArrayList move();
}

class Leopard {
    public Integer move() { // X
        return null;
    }
}

public class Panther implements Run {
    public ArrayList move() { // Z
        return null;
    }
}