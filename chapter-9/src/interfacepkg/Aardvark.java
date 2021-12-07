package interfacepkg;

interface LongEars {
  int softSkin();
}
interface LongNose {
  void softSkin();
}

// because of conflict, contain incompatible methods that prevent from compiling
//interface Donkey extends LongEars, LongNose {} // DOES NOT COMPILE
//abstract class Aardvark implements LongEars, LongNose {}
  // DOES NOT COMPILE