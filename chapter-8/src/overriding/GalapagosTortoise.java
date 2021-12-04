package overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

class Reptile {
  protected void sleepInShell() throws IOException {
  }

  // unchecked exception
  protected void hideInShell() throws NumberFormatException {
  }

  protected void exitShell() throws FileNotFoundException {
  }
}

public class GalapagosTortoise extends Reptile {
  // check exception should be narrower to guarantee , it is handled when we call it at runtime.
  // because if wider exception is handled then the narrower will implicitly be handled
  public void sleepInShell() throws FileNotFoundException, RuntimeException {
  }

  // unchecked exception
  public void hideInShell() throws
    IllegalArgumentException {
  }

  /*public void exitShell() throws IOException {
  } // DOES NOT*/
}