package command.injection;

import java.nio.file.Path;

public class ImmutablePathExample {
    public static void main(String[] args) {
        Path p = Path.of("whale");
        //p = p.resolve("krill");
        p.resolve("krill"); // because it is immutable, not change on the same object, so this change will be lost
        System.out.println(p);    // whale
    }
}
