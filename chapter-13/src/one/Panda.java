package one;

enum Size {SMALL, MEDIUM, LARGE}

public @interface Panda {
  // Integer height();         // doesn't compile, just primitives are supported but Wrappers are not supported
  // String[][] generalInfo(); // doesn't compile, the type String[],int[] are supported but int[][] or String[][] are not supported

  Size size() default Size.SMALL;

  // int[][] numbers();       //doesn't compile in[][] is not supported
  // Bear friendlyBear();     // just "Class" is supported, but Bear is not supported

  Class friendlyBear();

  Exercise exercise() default @Exercise(hoursPerDay = 2);
}

class Bear {
}