package Exercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read two integer numbers. Calculate the factorial of each number.
        Divide the first result by the second and print the division formatted to the second decimal point.
         */

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        long fact1 = calculateFactorial(firstNum);
        long fact2 = calculateFactorial(secondNum);
        double divisionResult = 1.0 * fact1 / fact2;
        System.out.printf("%.2f", divisionResult);

    }
//    public static long calculateFactorial (int number) {
//        long result = 1;
//        for (int i = 1; i <= number; i++) {
//            result *= i;
//        }
//        return result;
//    }

    //Recursive method:

    public static long calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
