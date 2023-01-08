package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a method that receives a string and a repeat count n (integer).
        The method should return a new string (the old one repeated n times).
         */

        String input = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(input, count));

    }

    public static StringBuilder repeatString(String input, int count) {
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(input).repeat(Math.max(0, count)));
        return result;
    }
}
