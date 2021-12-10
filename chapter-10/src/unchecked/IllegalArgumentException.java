package unchecked;

// thrown by the programmer when it isn't happy with parameter value
public class IllegalArgumentException {

  private int numberEggs;

  public static void main(String[] args) {
    new IllegalArgumentException().setNumberEggs(1);
  }

  void setNumberEggs(int numberEggs) { // setter
    if (numberEggs < 0) {
      throw new IllegalStateException("numberEggs should be larger than 0");
    }
    this.numberEggs = numberEggs;
  }
}
