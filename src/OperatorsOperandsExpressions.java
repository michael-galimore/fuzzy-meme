public class OperatorsOperandsExpressions {
//    int myTotal = 15 + 12
//    15 and 12 are the Operands
//    + is the Operator
//    27 is the answer or the expression.
//    Expression is the combination of variables, literals or methods.

    public static void main(String[] args) {
//        int result = 1 + 2; // 1 + 2 = 3
//        int previousResult = result;
//        System.out.println("1 + 2 equals " + result);
//        System.out.println("previous result equals " + previousResult);
//
//        result = result - 1;  // 3 - 1 = 2
//        System.out.println("3 - 1 = " + result);
//        System.out.println("previous result equals " + previousResult);
//
//        result = result * 10; // 3 * 10 = 20
//        System.out.println(result);
//
//        result = result / 5; // 20 / 5 = 4
//        System.out.println("20 / 5 equals " + result);
//
//        result = result % 3; // the remainder of (4 % 3) = 1    % is the modulus operator
//        System.out.println("4 % 3 = " + result);
//
//        //result = result + 1
//        result++;  // 1 + 1 = 2
//        System.out.println("1 + 1 = " + result);
//
//        result--;
//        System.out.println("2 - 1 = " + result);
//
//        //result +2
//        result += 2; // 1 + 2 = 3
//        System.out.println("1 + 2 = " + result);
//
//        //result = result * 10;
//        result *= 10; // 3 * 10 = 30
//        System.out.println("3 * 10 = " + result);
//
//        //result = result / 3
//        result /= 3;
//        System.out.println("30 / 3 = " + result);
//
//        //result = result - 2;
//        result -= 2;  // 10 - 2 = 8
//        System.out.println("10 - 2 = " + result);
//
//        boolean isAlien = false;
//        if(isAlien == false) {
//            System.out.println("It is not an alien.");
//        }
//        int topScore = 80;
//        if(topScore <= 100){
//            System.out.println("You got the high score!");
//        }
//        int secondTopScore = 81;
//        if((topScore > secondTopScore) && (topScore < 100)){
//            System.out.println("Greater than top score and less than 100");
//        }
//        if((topScore > 90) || (secondTopScore <= 90)){
//            System.out.println("Either or both of the conditions are true");
//        }
//
//        int newValue = 50;
//        if(newValue == 50){
//            System.out.println("This is true.");
//        }
//
        boolean isCar = false;
        if(isCar){
            //if(!isCar) can be used as well
            System.out.println("This is not suppose to happen.");
        }

//      The ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true.");
        }



// Create a double variable with a value of 20.00
        double myValue = 20.00d;
// Create a second variable of type double with the value 80.00
        double myValue2 = 80.00d;
// Add both numbers together and multiply by 100.00
        double totalValue = (myValue + myValue2) * 100;
        System.out.println(totalValue);
// Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00.
        double remainder = totalValue % 40.00d;
        System.out.println(remainder);
// We use the modulus or remainder operator on ints in the course but, we can also use it on a double
// Create a boolean variable that assigns the value to true if the remainder in #4 is 0 or false if it is not zero.
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println(isNoRemainder);
// Output the boolean variable.
// Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true. Don't
// be surprised if you see output for this step, where you might expect it not to show.

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }


}
