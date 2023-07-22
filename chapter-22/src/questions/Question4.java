package questions;

import java.util.ArrayList;

public class Question4 {
    private ArrayList<Double> weights;
    public Question4(ArrayList<Double> weights) {
        // clone() method returns an Object and needs to be cast, so that option does not compile.
        this.weights = (ArrayList<Double>) weights.clone();
    }
}
