package enumpkg;

import java.util.Arrays;

public class EnumTest2 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Season.values()));   // [WINTER, SUMMER, FALL, SPRING]
    System.out.println(Season.FALL.name());                 // FALL
    System.out.println(Season.FALL.getExpectedVisitors());  // Medium
  }

  private enum Season {
    WINTER("Low"),
    SUMMER("High"),
    FALL("Medium"),
    SPRING("Medium");

    private final String expectedVisitors;

    Season(String expectedVisitors) {
      this.expectedVisitors = expectedVisitors;
    }

    public String getExpectedVisitors() {
      return expectedVisitors;
    }

    @Override
    public String toString() {
      return "Season{" +
        "Season='" + this.name() + "'," +
        "expectedVisitors='" + expectedVisitors + '\'' +
        '}';
    }
  }
}
