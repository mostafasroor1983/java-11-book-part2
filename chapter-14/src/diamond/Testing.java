package diamond;

import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        //List<> list = new ArrayList<Integer>();     // DOES NOT COMPILE, the generic should be on the left side
        //Map<> map = new HashMap<String, Integer>(); // DOES NOT COMPILE

        //creates an ArrayList<Object>.
        var list2 = new ArrayList<>();        //list2 of type ArrayList with Object
        //creates an ArrayList<Integer>
        var list3 = new ArrayList<Integer>(); //list3 of type ArrayList with Integer
    }
}

class InvalidUse {
    //void use(List<> data) {} // DOES NOT COMPILE
}
