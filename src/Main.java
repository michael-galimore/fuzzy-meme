public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value " + myMinByteValue);
        System.out.println("Maximum Byte Value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value " + myMinShortValue);
        System.out.println("Maximum Short Value " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value " + myMinLongValue);
        System.out.println("Maximum Long Value " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = myMinIntValue / 2;

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte myByteNum = 125;
        short myShortNum = 32767;
        int myIntNum = 1_5_000_000;
        long crazyNum = 50000L + (myByteNum + myShortNum + myIntNum) * 10;

        System.out.println("My crazy total is " + crazyNum);






    }
}
