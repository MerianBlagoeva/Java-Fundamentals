package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Create a program that reads an integer number and multiplies the sum
        of all its even digits by the sum of all its odd digits.
         */

        int num = Integer.parseInt(sc.nextLine());
        System.out.println(getMultipleOFEvenAndOdds(num));

    }

    public static int getMultipleOFEvenAndOdds(int num) {
        int evenSum = getSumOfEvenDigits(num);
        int oddSum = getSumOfOddDigits(num);
        return evenSum * oddSum;
    }

    public static int getSumOfEvenDigits(int num) {
        num = Math.abs(num);
        int evenSum = 0;

        String numbers = String.valueOf(num);

        int[] numbersArr = Arrays.
                stream(numbers.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int j : numbersArr) {
            if (j % 2 == 0) {
                evenSum += j;
            }
        }
        return evenSum;

    }

    public static int getSumOfOddDigits(int num) {
        num = Math.abs(num);
        int oddSum = 0;

        String numbers = String.valueOf(num);

        int[] numbersArr = Arrays.
                stream(numbers.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int j : numbersArr) {
            if (j % 2 != 0) {
                oddSum += j;
            }
        }
        return oddSum;

    }
}
