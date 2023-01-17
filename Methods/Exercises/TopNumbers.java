package Exercises;

import java.util.Scanner;

public class TopNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
        A top number holds the following properties:
            •	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
            •	Holds at least one odd digit, e.g. 232, 707, 87578.
         */

        int number = Integer.parseInt(sc.nextLine());
        printTopNumbers(number);

    }

    public static void printTopNumbers(int num) {

        for (int i = 1; i <= num; i++) {

            boolean holdsOddDigit = false;
            int sum = 0;
            int currentNumber = i;

            while (currentNumber > 0) {
                int digit = currentNumber % 10;
                if (digit % 2 != 0) {
                    holdsOddDigit = true;
                }

                sum += digit;
                currentNumber /= 10;

            }
            if ((holdsOddDigit) && sum % 8 == 0) {
                System.out.println(i);

            }
        }
    }
}
