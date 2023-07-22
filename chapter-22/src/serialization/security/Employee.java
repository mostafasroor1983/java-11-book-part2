package serialization.security;

import java.io.*;

public class Employee implements Serializable {
    private String name;
    private String ssn;
    private int age;

    public Employee(String name, String ssn, int age) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
    }

    // Constructors/getters/setters
    private static final ObjectStreamField[] serialPersistentFields =
            {new ObjectStreamField("name", String.class),
                    new ObjectStreamField("ssn", String.class)};

    private static String encrypt(String input) {
        // Implementation omitted
        return "";
    }

    private static String decrypt(String input) {
        // Implementation omitted
        return "";
    }

    private void writeObject(ObjectOutputStream s) throws Exception {
        ObjectOutputStream.PutField fields = s.putFields();
        fields.put("name", name);
        fields.put("ssn", encrypt(ssn));

        //java.lang.IllegalArgumentException: no such field age with type int
        //fields.put("age", age);
        s.writeFields();
    }

    private void readObject(ObjectInputStream s) throws Exception {
        ObjectInputStream.GetField fields = s.readFields();
        this.name = (String) fields.get("name", null);
        this.ssn = decrypt((String) fields.get("ssn", null));
    }

    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Mostafa", "BS190", 40);
        employee.writeObject(new ObjectOutputStream(new FileOutputStream("serialization2.txt")));
        employee.readObject(new ObjectInputStream(new FileInputStream("serialization2.txt")));
        System.out.println(employee.name + " " + employee.ssn);
    }
}