package generics;

import java.util.ArrayList;
import java.util.List;


public class LowerBoundWildcard {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
  }

  // List<?> and List<? extends String>:can pass List<String> and List<Object>, but the list is immutable
  // List<Object> can't pass List<String>
  // List<? super String> just with this compile that can pass List<String> and List<Object>
  /*With a lower bound, we are telling Java that the list will be a
    list of String objects or a list of some objects that are a
    superclass of String*/
  public static void addSound(List<? super String> list) {
    list.add("quack");
  }

}
