package polymophism;

interface Canine { }

class Dog implements Canine { }

class Wolf implements Canine { }

public class BadCasts {
  public static void main(String[] args) {
    Canine canine = new Wolf();
    Canine badDog = (Dog) canine;
  }
}