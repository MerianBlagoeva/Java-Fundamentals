package Hello;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isFound = false;
        for (int i = 0; i < numbersArr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbersArr[j];
            }

            for (int j = i + 1; j < numbersArr.length; j++) {
                rightSum += numbersArr[j];
            }
            if (rightSum == leftSum) {
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}

