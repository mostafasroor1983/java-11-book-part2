package innerclasses;


// can have public or package-private access modifier
public class Zoo {
  public static void main(String[] args) {
    var z = new Zoo();
    var t = z.sellTicket("12345");
    System.out.println(t.getId() + " Ticket sold!");
  }

  public Ticket sellTicket(String serialNumber) {
    var t = new Ticket();
    t.serialNumber = serialNumber;
    return t;
  }

  // can have any access modifier like any member.
  private interface Paper {
    String getId();
  }

  public class Ticket implements Paper {
    // static is not acceptable on members of inner member classes
    private String serialNumber;

    public String getId() {
      return serialNumber;
    }
  }
}
