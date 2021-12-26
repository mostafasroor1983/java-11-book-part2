package privateMethodInterface;

public interface Schedule {
  default void wakeUp() {
    checkTime(7);
  }

  default void haveBreakfast() {
    checkTime(9);
  }

  default void haveLunch() {
    checkTime(12);
  }

  default void workOut() {
    checkTime(18);
  }

  // private method in interface can be used to reduce code duplication.
  // can be called in default methods.
  private void checkTime(int hour) {
    if (hour > 17) {
      System.out.println("You're late!");
    } else {
      System.out.println("You have " + (17 - hour) + " hours  left" + "to make the appointment");
    }
  }
}