package constructors.superConst;

public class MouseHouse {
  private final int volume;
  private final String type;

  {
    this.volume = 10;
  }

  public MouseHouse(String type) {
    this.type = type;
  }

  public MouseHouse() { // DOES NOT COMPILE
    //even though it initialized in the first constructor
    //it should be initialized here because it doesn't initialize on declare or un instance initializer
    // in summary after complete each constructor each final variable should be initialized once
    this.type = "";
    //this.volume = 2; // DOES NOT COMPILE
    //this(""); // this will resolve the problem because "type" variable will be initialized once in each constructor
  }
}