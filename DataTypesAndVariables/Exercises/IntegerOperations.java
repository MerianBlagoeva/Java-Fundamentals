package Exercises;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Read four integer numbers.
         Add first to the second, divide (integer) the sum by the third number,
          and multiply the result by the fourth number. Print the result.
         */

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int fourth = Integer.parseInt(sc.nextLine());

        int result = (first + second) / third * fourth;
        System.out.println(result);
    }
}
