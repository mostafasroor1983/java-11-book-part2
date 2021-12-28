package seven;

import java.util.*;

class SongBird {
  @Deprecated
  static void sing(int volume) {
    System.out.println("sing");
  }

  static Object chirp(List<String> data) {
    System.out.println("chirp");
    return data.size();
  }
}

//@SuppressWarnings({"deprecation","unchecked"})
public class Nightingale {
  public static void main(String[] args) {
    var birdy = new Nightingale();
    birdy.wakeUp();
    birdy.goToBed();
  }

  @SuppressWarnings("deprecation")
  public void wakeUp() {
    SongBird.sing(10);
  }

  @SuppressWarnings("unchecked")
  public void goToBed() {
    SongBird.chirp(new ArrayList());
  }
}