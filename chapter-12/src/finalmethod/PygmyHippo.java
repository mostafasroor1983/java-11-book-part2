package finalmethod;

abstract class Animal {
  abstract void chew();
}

class Hippo extends Animal {
  final void chew() {
  }
}

public class PygmyHippo extends Hippo {
  // void chew() {} // DOES NOT COMPILE, because we can't override the final method
}