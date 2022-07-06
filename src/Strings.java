public class Strings {

    public static void main(String[] args) {
//        byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
//        49.95 appends to 250.55 and is not added because it is a string.
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString =lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);

    }
}
