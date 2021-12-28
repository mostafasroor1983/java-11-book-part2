package two;

 @interface Material {}
public @interface Fluffy {
  int cuteness();
  public abstract int softness() default 11;

  // because annotation elements are abstract and public implicitly
  //protected Material material(); // DOES NOT COMPILE
  //private String friendly(); // DOES NOT COMPILE
  //final boolean isBunny(); // DOES NOT COMPILE
}