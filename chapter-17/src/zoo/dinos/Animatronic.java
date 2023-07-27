package zoo.dinos;

import sun.misc.Unsafe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Animatronic {
    private List<String> names;
    private LocalDate visitDate;

    public Animatronic(List<String> names, LocalDate visitDate) {
        this.names = names;
        this.visitDate = visitDate;
    }

    public void unsafeMethod() {
        Unsafe unsafe = Unsafe.getUnsafe();
    }

    static void readFile() throws IOException {
        try (var reader = new BufferedReader(new FileReader("text2.txt"))) {
            String line = "";
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}