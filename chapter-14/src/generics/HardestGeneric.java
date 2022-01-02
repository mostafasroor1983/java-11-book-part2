package generics;

import java.util.ArrayList;
import java.util.List;

public class HardestGeneric {
  public static void main(String[] args) {
    //All of them does compile
    List<?> list1 = new ArrayList<A>();
    List<? extends A> list2 = new ArrayList<A>();
    List<? extends A> list3 = new ArrayList<B>();
    List<? extends A> list4 = new ArrayList<C>();
    List<? super A> list5 = new ArrayList<A>();
    List<? super A> list6 = new ArrayList<Object>();
    List<? super B> list10 = new ArrayList<A>();

    //doesn't compile
    //List<? super A> list7 = new ArrayList<C>();
    //List<? extends A> list8 = new ArrayList<Object>();
    //List<? extends B> list9 = new ArrayList<A>();
    //List<?> list11 = new ArrayList<? extends A>();
    //List<A> list12 = new ArrayList<? extends A>();
    //List list13 = new ArrayList<? extends A>();
  }
}

class A {
}

class B extends A {
}

class C extends B {
}
