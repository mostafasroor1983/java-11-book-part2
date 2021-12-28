package one;

public @interface Exercise {

  int startHour() default 1;

  int hoursPerDay();
}