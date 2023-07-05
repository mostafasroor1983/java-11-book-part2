package overriding.generic;

import java.util.ArrayList;
import java.util.List;

class LongTailAnimal {
    protected void chew(List<Object> input) {
    }
}

public class Anteater extends LongTailAnimal {
    // doesn't overload or override
    protected void chew(ArrayList<Double> input) {
    } // DOES NOT COMPILE*/

    // overloading because the signature is not the same
    //protected void chew(ArrayList<String> input) {}
}