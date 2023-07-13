package three;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample2 {


    static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile)
            throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimpanzee : chimpanzees)
                out.writeObject(chimpanzee);
        }
    }

    static List<Chimpanzee> readFromFile(File dataFile) throws IOException {
        List<Chimpanzee> gos = new ArrayList<>();
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee)
                    gos.add((Chimpanzee) object);
            }
        } catch (EOFException | ClassNotFoundException ex) {
            //System.out.println(ex.getMessage());
        }

        return gos;
    }

    public static void main(String[] args) throws IOException {
        List<Chimpanzee> chimpanzees = new ArrayList<>();
        File file = new File("serialization.txt");
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        saveToFile(chimpanzees, file);
        System.out.println(readFromFile(file));
    }

    private static class Chimpanzee implements Serializable {
        private static final long serialVersionUID = 2L;
        private transient String name;
        private transient int age = 10;
        private static char type = 'C';

        {
            this.age = 14;
        }

        public Chimpanzee() {
            this.name = "Unknown";
            this.age = 12;
            this.type = 'Q';
        }

        public Chimpanzee(String name, int age, char type) {
            this.name = name;
            this.age = age;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static char getType() {
            return type;
        }

        public static void setType(char type) {
            Chimpanzee.type = type;
        }


        @Override
        public String toString() {
            return "Chimpanzee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
