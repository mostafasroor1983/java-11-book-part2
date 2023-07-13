package three;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {


    static void saveToFile(List<Gorilla> gorillas, File dataFile)
            throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
        }
    }

    static List<Gorilla> readFromFile(File dataFile) throws IOException {
        List<Gorilla> gos = new ArrayList<>();
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla)
                    gos.add((Gorilla) object);
            }
        } catch (EOFException | ClassNotFoundException ex) {
            //System.out.println(ex.getMessage());
        }

        return gos;
    }

    public static void main(String[] args) throws IOException {
        List<Gorilla> gos = new ArrayList<>();
        File file = new File("serialization.txt");
        gos.add(new Gorilla("A", "A"));
        gos.add(new Gorilla("C", "C"));
        saveToFile(gos, file);
        System.out.println(readFromFile(file));
    }

    private static class Gorilla implements Serializable {
        String name;
        String type;

        public Gorilla(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Gorilla{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

}
