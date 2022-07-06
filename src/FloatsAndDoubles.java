public class FloatsAndDoubles {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

//        Challenge
//        1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
//        2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
//        3. Print out result.

        double myPoundage = 15d;
        double conversion = 0.45359237d;
        double converted = myPoundage * conversion;
        System.out.println(myPoundage + " pounds "+"equals " + converted + " kilograms!" );






    }
}
