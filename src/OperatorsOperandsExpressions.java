public class OperatorsOperandsExpressions {
//    int myTotal = 15 + 12
//    15 and 12 are the Operands
//    + is the Operator
//    27 is the answer or the expression.
//    Expression is the combination of variables, literals or methods.

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        int previousResult = result;
        System.out.println("1 + 2 equals " + result);
        System.out.println("previous result equals " + previousResult);

        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result equals " + previousResult);

        result = result * 10; // 3 * 10 = 20
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 equals " + result);

        result = result % 3; // the remainder of (4 % 3) = 1    % is the modulus operator
        System.out.println("4 % 3 = " + result);


    }


}
