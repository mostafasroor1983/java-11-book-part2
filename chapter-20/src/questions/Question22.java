package questions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Question22 {
    void duplicateFile(Path m, Path x) throws Exception {
        //The APPEND option creates the file if it does not exist;
        //otherwise, it starts writing from the end of the file.
        var r = Files.newBufferedReader(m);
        var w = Files.newBufferedWriter(x,
                StandardOpenOption.APPEND);
        String currentLine = null;

        //The method copies the contents of a file, but it removes all the line breaks.
        // The while() loop would need to include a call to w.newLine() to correctly copy the file.
        while ((currentLine = r.readLine()) != null)
            w.write(currentLine);
    }
}
