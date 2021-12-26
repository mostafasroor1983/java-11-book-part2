package multipleInteritance;

interface Walk {
  default int getSpeed() {
    return 5;
  }
}

interface Run {
  default int getSpeed() {
    return 10;
  }
}


public class Cat implements Walk, Run {
  public static void main(String[] args) {
    System.out.println(new Cat().getSpeed());
    System.out.println(new Cat().getWalkSpeed());
  }

  @Override
  public int getSpeed() {
    // call getSpeed method in Run interface
    return Run.super.getSpeed();
  }

  public int getWalkSpeed() {
    // call getSpeed method in Walk interface
    return Walk.super.getSpeed();
  }
}

// because Cat class should override method getSpeed
/*
public class Cat implements Walk, Run { // DOES NOT COMPILE
  public static void main(String[] args) {
    System.out.println(new Cat().getSpeed());
  }
}*/
