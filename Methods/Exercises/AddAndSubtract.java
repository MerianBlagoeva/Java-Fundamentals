package Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You will receive 3 integers.
        Write a method sum to get the sum of the first two integers and subtract
        the method that subtracts the third integer from the result from the sum method.
         */

        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        int number3 = Integer.parseInt(sc.nextLine());

        int sum = sum(number1, number2);
        int result = subtract(sum, number3);
        System.out.println(result);


    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
}
