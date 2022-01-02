package generics;

public class Crate<T> {
  private T contents;

  public static void main(String[] args) {
    Elephant elephant = new Elephant("A");
    Crate<Elephant> crateForElephant = new Crate<>();
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = crateForElephant.emptyCrate();
    System.out.println(inNewHome);

    Robot joeBot = new Robot("AB.1.1.0");
    Crate<Robot> robotCrate = new Crate<>();
    robotCrate.packCrate(joeBot);
    // ship to St. Louis
    Robot atDestination = robotCrate.emptyCrate();
    System.out.println(atDestination);
  }

  public T emptyCrate() {
    return contents;
  }

  public void packCrate(T contents) {
    this.contents = contents;
  }

  private static class Robot {
    private String Id;

    public Robot(String id) {
      Id = id;
    }

    @Override
    public String toString() {
      return "Robot{" +
        "Id='" + Id + '\'' +
        '}';
    }
  }

  private static class Elephant {
    private String name;

    public Elephant(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Elephant{" +
        "name='" + name + '\'' +
        '}';
    }
  }
}