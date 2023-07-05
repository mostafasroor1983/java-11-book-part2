package tryresources;

public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    /*
    * closing:2
      closing:1
      ex
      finally
  * */
    public static void main(String... xyz) {
        try (MyFileClass a1 = new MyFileClass(1);
             MyFileClass a2 = new MyFileClass(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }

    public void close() {
        System.out.println("Closing: " + num);
    }

}