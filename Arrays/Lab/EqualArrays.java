package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read two arrays and print on the console whether they are identical or not.
        Arrays are identical if their elements are equal. If the arrays are identical,
        find the sum of the first one and print on the console the following message:
        "Arrays are identical. Sum: {sum}", otherwise find the first index where
        the arrays differ and print on the console following message: "Arrays are not identical. Found difference at {index} index."
         */

        int[] firstArr = Arrays.
                        stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int[] secondArr = Arrays.
                stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean isEqual = true;

        for (int i = 0; i < firstArr.length; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
