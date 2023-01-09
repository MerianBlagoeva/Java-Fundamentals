package Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Create a method that prints the sign of an integer number.
         */

        int num = Integer.parseInt(sc.nextLine());
        printNumbersSign(num);
    }
    public static void printNumbersSign(int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}