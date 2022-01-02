package generics;

public interface Shippable<T> {
  void ship(T t);
}

// First approach for implementing the Shippable interface
// The following concrete class says that it deals only with robots.
class ShippableRobotCrate implements Shippable<Robot> {
  public void ship(Robot t) {
  }
}

// Second approach that allowing the call to create a generic class.
// The following concrete class allows the caller to specify the type of the generic.
// That approach add a new layer of abstraction allowing the caller to have flexibility to work with many types
class ShippableAbstractCrate<U> implements Shippable<U> {
  public void ship(U t) {
  }
}

// Third approach is not to use generic at all, this is the old way to write the code.
// It generates a compiler warning about Shippable being a raw type, but it does compile.
class ShippableCrate implements Shippable {
  public void ship(Object t) {
  }
}

class Robot {
}