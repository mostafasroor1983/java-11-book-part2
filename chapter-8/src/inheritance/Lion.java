package inheritance;

public class Lion extends Animal {
  public static void main(String[] args) {
    var lion = new Lion();
    lion.setProperties(3, "kion");
    lion.roar();
  }

  public void setProperties(int age, String n) {
    setAge(age);
    name = n;
  }

  public void roar() {
    System.out.print(name + ", age " + getAge() + ", says: Roar!");
  }
}