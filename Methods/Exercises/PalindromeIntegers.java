package Exercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
        Write a program that reads a positive integer number until you receive "END".
        For each numbered print, whether the number is palindrome or not.
         */

        String input = sc.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));

            input = sc.nextLine();
        }

    }

    public static boolean isPalindrome(String n) {
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        String reversedNumber = String.valueOf(sb);
        return reversedNumber.equals(n);
    }
}
