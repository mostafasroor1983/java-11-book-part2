package interfacepkg;

public class FieldMouse implements CanBurrow, Climb {

  public static void main(String[] args) {
    Climb climb = new FieldMouse();
    System.out.println(climb.getSpeed(10));

    CanBurrow canBurrow = new FieldMouse();
    System.out.println(canBurrow.getSpeed(100));

    System.out.println(NUM_DEPTH);
  }

  //Float is covariant variable type with Float from CanBurrow and Number from Climb
  @Override
  public Float getSpeed(int age) {
    return 1.1f * age;
  }
}
