package sql.injection;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Method reference can look the same even when
 * it will behave differently based on the surrounding context.*/
public class Penguin {
    public static Integer countBabies(Penguin... cuties) {
        return cuties.length;
    }

    public static void main(String[] args) {
        Supplier<Integer> methodRef1 = Penguin::countBabies;
        Supplier<Integer> lambda1 = () -> Penguin.countBabies(new Penguin());

        System.out.println(methodRef1.get()); //0
        System.out.println(lambda1.get());    //1

        System.out.println("---------------------------------");
        Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
        Function<Penguin, Integer> lambda2 = (x) -> Penguin.countBabies(x);

        System.out.println(methodRef2.apply(new Penguin()));
        System.out.println(lambda2.apply(new Penguin()));

        System.out.println("---------------------------------");
        BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
        BiFunction<Penguin, Penguin, Integer> lambda3 = (x, y) -> Penguin.countBabies(x, y);

        System.out.println(methodRef3.apply(new Penguin(), new Penguin()));
        System.out.println(lambda3.apply(new Penguin(), new Penguin()));

        System.out.println("---------------------------------");
        Function<Penguin[], Integer> methodRef4 = Penguin::countBabies;
        Function<Penguin[], Integer> lambda4 = (x) -> Penguin.countBabies(x);
        Penguin[] penguins = new Penguin[3];
        penguins[0] = new Penguin();
        penguins[1] = new Penguin();
        penguins[2] = new Penguin();
        System.out.println(methodRef4.apply(penguins));
        System.out.println(lambda4.apply(penguins));
    }
}