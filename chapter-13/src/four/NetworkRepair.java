package four;

// Technical.java

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface Technical {
}

// NetworkRepair.java
@Technical
public class NetworkRepair {
  public void repair() {
    var repairSubclass = new @Technical NetworkRepair() {  };
    var o = new @Technical NetworkRepair().new @Technical OutSrc();
    int remaining = (@Technical int) 10.0;
  }

  class OutSrc extends @Technical NetworkRepair {
  }
}