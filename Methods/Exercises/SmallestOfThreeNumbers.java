package Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a method to print the smallest of three integer numbers.
        Use an appropriate name for the method.
         */
        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        int number3 = Integer.parseInt(sc.nextLine());

        printSmallestNumber(number1, number2, number3);
    }
    public static void printSmallestNumber(int a, int b, int c) {
        int smallest = 0;
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }
        System.out.println(smallest);

    }
}
