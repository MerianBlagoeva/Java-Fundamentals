package Exercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        //You will be given a single integer.
        // Your task is to find the sum of its digits.
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
