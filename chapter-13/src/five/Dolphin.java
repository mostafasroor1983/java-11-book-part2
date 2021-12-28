package five;


import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@interface Vertebrate { }

@Vertebrate
class Mammal { }

//@Vertebrate annotation will be applied to both Mammal and Dolphin objects.
//Without the @Inherited annotation, @Vertebrate would apply only to Mammal instances.
public class Dolphin extends Mammal {
  public static void main(String[] args) {
    checkVertebrate(new Dolphin());
    checkVertebrate(new Mammal());
  }

  private static void checkVertebrate(Object object) {
    Class<?> clazz = object.getClass();
    if (clazz.isAnnotationPresent(Vertebrate.class)) {
      System.out.println("class " + clazz + " is annotated with @Vertebrate");
    }
  }

}