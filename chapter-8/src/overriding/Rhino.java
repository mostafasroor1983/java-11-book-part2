package overriding;

public class Rhino {
  protected CharSequence getName() {
    return "rhino";
  }

  protected String getColor() {
    return "grey, black, or white";
  }

  protected Number getInt() {
    return 1;
  }

  protected int getI() {
    return 1;
  }

}

class JavanRhino extends Rhino {
  public String getName() {
    return "javan rhino";
  }

  public Integer getInt() {
    return 1;
  }

  /*protected Integer getI() { // DOES NOT COMPILE
    return 1;
  }
*/
  // doesn't covariant return type because is not subtype
  /*public CharSequence getColor() { // DOES NOT COMPILE
    return "grey";
  }*/
}