package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read an array from the console and sum only the even numbers.
         */

        String lineInput = sc.nextLine();
        int[] numbersArr = Arrays.
                stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int currentNum : numbersArr) {
            if (currentNum % 2 == 0) {
                sum += currentNum;
            }
        }
        System.out.println(sum);
    }
}
