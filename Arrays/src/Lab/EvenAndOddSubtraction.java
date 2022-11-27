package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that calculates the difference between
        the sum of the even and the sum of the odd numbers in an array.
         */

        int[] numbersArr = Arrays.
                        stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbersArr) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
