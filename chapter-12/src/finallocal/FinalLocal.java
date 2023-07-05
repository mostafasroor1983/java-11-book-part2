package finallocal;

public class FinalLocal {

    private static void printFinalSB() {
        // you can change the state of final local object (constant object), but you can't refer it to another object
        final StringBuilder sb = new StringBuilder();
        //sb = new StringBuilder("By ");

        sb.append("Hello ").append("Man");
        System.out.println(sb);
    }

    private static void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) {
            lemur = 5;
        } else {
            lemur = 10;
        }
        System.out.println(giraffe + " " + lemur);
        printFinalSB();
    }

    public static void main(String[] args) {
        printZooInfo(true);
    }

    private static void printZooInfo2(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) {
            lemur = 5;
        }
        // giraffe = 3; // DOES NOT COMPILE because another value assignment for giraffe local final variable
        // System.out.println(giraffe+" "+lemur); // DOES NOT COMPILE, because lemur is partially initialized just if isWeekend is true
    }
}
