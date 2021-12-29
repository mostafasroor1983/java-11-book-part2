package three;

@interface Injured {
  String veterinarian() default "unassigned";
  String value() default "foot";
  int age() default 1;
  int m =10;
}

@Injured("Feet")
public class CheckAnnotationWithValue {}

abstract class Elephant {
  @Injured("Legs") public void fallDown() {}
  @Injured(value="Legs") public abstract int trip();
  @Injured String injuries[];
}
