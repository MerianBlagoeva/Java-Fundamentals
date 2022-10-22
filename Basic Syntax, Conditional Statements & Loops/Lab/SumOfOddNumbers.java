package Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(1 + i * 2);
            sum += 1 + i * 2;
        }
        System.out.printf("Sum: %d", sum);

//        int oddNumbersFound = 0;
//        int number = 1;
//        while (oddNumbersFound < n) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//                oddNumbersFound ++;
//            }
//            number++;
//        }
    }
}
