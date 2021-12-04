package superRef;

class Mammal {
  String type = "mammal";
}

public class Bat extends Mammal {
  String type = "bat";

  public static void main(String... zoo) {
    System.out.print(new Bat().getType());
  }

  public String getType() {
    // type = bat; //  delete this "String type = "bat";" =>  just  a single version of variable exist in parent and child classes
    return super.type + ":" + type;
  }
}