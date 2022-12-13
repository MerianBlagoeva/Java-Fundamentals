package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.
                        stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int sum = 0;
        for (int j : numbersArr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
