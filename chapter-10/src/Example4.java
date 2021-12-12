
public class Example4 {
  public static void main(String[] args) {
    System.out.println(exceptions());
  }

  static String exceptions() {
    StringBuilder result = new StringBuilder();
    String v = null;
    try {
      try {
        result.append("before_");
        v.length();
        result.append("after_");
      } catch (NullPointerException e) {
        result.append("catch_");
        throw new RuntimeException();
      } finally {
        result.append("finally_");
        throw new Exception();
      }
    } catch (Exception e) {
      result.append("done");
    }
    return result.toString();
  }

}
