package questions;

import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        //The problem here is that c1 is an int and c2 is a String, so the code fails to
        //combine on line q2, since calling length() on an int is not allowed,
        /*System.out.print(List.of("duck", "flamingo", "pelican")
                .parallelStream().parallel() // q1
                .reduce(0,
                        (c1, c2) -> c1.length() + c2.length(), // q2
                        (s1, s2) -> s1 + s2)); // q3*/
    }
}
