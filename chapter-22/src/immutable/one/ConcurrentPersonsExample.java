package immutable.one;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentPersonsExample {
    public static void main(String[] args) {
        final Person sharedPerson = new Person("John", 30);
        final int numTasks = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numTasks);

        //Since Person is an immutable class, there's no need to worry about race conditions or concurrent modifications.
        // Each thread will see a consistent and unchanging state of the Person object.
        //By using immutable objects like the Person class in concurrent scenarios,
        // we can simplify the code and avoid the complexities of managing synchronization and potential race conditions,
        // leading to more reliable and maintainable code.
        for (int i = 0; i < numTasks; i++) {
            Runnable task = new PersonTask(sharedPerson);
            executor.execute(task);
        }

        executor.shutdown();
    }
}

class PersonTask implements Runnable {
    private final Person person;

    public PersonTask(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        // Access the shared Person object without any synchronization
        String name = person.getName();
        int age = person.getAge();

        // Print the result
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
