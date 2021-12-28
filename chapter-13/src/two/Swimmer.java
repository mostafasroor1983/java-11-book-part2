package two;

public @interface Swimmer {
  int armLength = 10;

  String stroke();

  String name();

  String favoriteStroke() default "Backstroke";
}