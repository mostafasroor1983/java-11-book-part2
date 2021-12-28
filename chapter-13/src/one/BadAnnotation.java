package one;

public @interface BadAnnotation {
  //because it is not a constant expression,
  //String name() default new String(""); // DOES NOT COMPILE
  String address() default "";
  //because it is null
  //String title() default null;          // DOES  NOT COMPILE
}