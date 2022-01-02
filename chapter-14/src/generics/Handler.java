package generics;


import java.util.List;

//Not just on class and interface level
// It is also possible to declare generics on the method level. This is often useful for
//static methods since they aren't part of an instance that can declare the type.
public class Handler {
  //Before the return type, we declare the formal type parameter of <T>.
  public static <T> void prepare(T t) {
    System.out.println("Preparing " + t);
  }

  //Before the return type, we declare the formal type parameter of <T>.
  public static <T> Crate<T> ship(T t) {
    System.out.println("Shipping " + t);
    return new Crate<T>();
  }

  //We should define that method include generic by setting <T> before return type.
  //Unless a method is obtaining the generic formal type
  //parameter from the class/interface, it is specified immediately
  //before the return type of the method.
  //public static T noGood(T t) { return t; } // DOES NOT COMPILE

  public static void main(String[] args) {
    //You can call a generic method normally, and the compiler will try to figure out which one you want.
    // Alternatively, you can specify the type explicitly to make it obvious what the type is.
    Handler.<String>prepare("Dog");
    Handler.<Integer>prepare(1);
    Handler.prepare("Dog");
    Handler.prepare(1);

    Handler.<List<String>>prepare(List.of("A","B","C"));
    Handler.prepare(List.of("A","B","C"));
  }
}