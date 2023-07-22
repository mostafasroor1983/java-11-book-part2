package immutable.one;


//Creating an immutable object:
//1. Mark the class as final.
//2. Mark all the instance variables private.
//3. Don't define any setter methods and make fields final.
//4. Don't allow referenced mutable objects to be modified.
//5. Use a constructor to set all properties of the object, making a
//copy if needed.
public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

