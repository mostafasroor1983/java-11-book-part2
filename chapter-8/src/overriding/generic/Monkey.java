package overriding.generic;

import java.util.ArrayList;
import java.util.List;

class Mammal {
    public List<CharSequence> play() {
        return null;
    }


    public CharSequence play2() {
        return null;
    }

    public CharSequence sleep() {
        return null;
    }
}

public class Monkey extends Mammal {
    // overriding because covariant return type with the same generic type
    public ArrayList<CharSequence> play() {
        return null;
    }

    // overriding because covariant return type
    public String play2() {
        return null;
    }

    // override using covariant return type
    public String sleep() {
        return null;
    }
}

class Goat extends Mammal {
    // not overloading because no different params
    // not overriding because not same generic type
    //public List<String> play() { return null; } // DOES NOT COMPILE
    public String sleep() {
        return null;
    }
}
