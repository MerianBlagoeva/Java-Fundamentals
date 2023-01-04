package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        Write a method that receives two numbers and an operator,
        calculates the result, and returns it.
        You will be given three lines of input. The first will be the first number,
        the second one will be the operator, and the last one will be the second number.
        The possible operators are: / * + -
        Print the result rounded up to the second decimal point.

         */

        int firstNum = Integer.parseInt(sc.nextLine());
        String operation = sc.nextLine();
        int secondNum = Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat("##").format(calculate(firstNum, operation, secondNum)));


    }

    public static double calculate(int a, String operator, int b) {
        int result = 0;
        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }

}
