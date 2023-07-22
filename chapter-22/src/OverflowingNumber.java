public class OverflowingNumber {
    public static void main(String[] args) {
        System.out.println(enoughRoomToAddLine(100));
        System.out.println(enoughRoomToAddLine(2_000_000));
        System.out.println(enoughRoomToAddLine(Integer.MAX_VALUE));
    }

    public static boolean enoughRoomToAddLine(int requestedSize) {
        int maxLength = 1_000_000;
        String newLine = "END OF FILE";
        int newLineSize = newLine.length();
        System.out.println("requestedSize + newLineSize:" + requestedSize + newLineSize);

        //When accepting numeric input, you need to verify it isn't too large or too small.
        //In this example, the input value requestedSize should have been checked before adding it to newLineSize.
        //return  requestedSize + newLineSize < maxLength;

        return requestedSize + newLineSize > 0 && requestedSize + newLineSize < maxLength;
    }
}
