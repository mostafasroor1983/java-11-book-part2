package two;

public @interface ElectricitySource {

  //annotation elements are implicitly abstract and public
  public int voltage();

  //like interface variables, annotation variables are implicitly public, static, and final.
  int MIN_VOLTAGE = 2;
  public static final int MAX_VOLTAGE = 18;
}