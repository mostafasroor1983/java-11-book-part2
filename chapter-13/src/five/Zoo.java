package five;

import java.lang.annotation.Repeatable;

@interface Risks {
  Risk[] value();
}

@Repeatable(Risks.class)
@interface Risk {
  String danger();
  int level() default 1;
}

public class Zoo {
  @Risk(danger = "Silly")
  @Risk(danger = "Aggressive", level = 5)
  @Risk(danger = "Violent", level = 10)
  private Monkey monkey;

  public static class Monkey {
  }
}
