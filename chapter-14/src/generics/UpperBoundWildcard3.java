package generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard3 {

  public static void main(String[] args) {
    List<Flyer> flyerList = new ArrayList<>();
    flyerList.add(new Goose());
    flyerList.add(new HangGlider());
    anyFlyer(flyerList);
    groupOfFlyers(flyerList);

    //============================
    List<Goose> gooseList = new ArrayList<>();
    //anyFlyer(gooseList); doesn't compile
    groupOfFlyers(gooseList);
  }

  private static void anyFlyer(List<Flyer> flyer) {
  }

  private static void groupOfFlyers(List<? extends Flyer> flyer) {
  }

  interface Flyer {
    void fly();
  }

  static class HangGlider implements Flyer {
    public void fly() {
    }
  }

  static class Goose implements Flyer {
    public void fly() {
    }
  }
}
