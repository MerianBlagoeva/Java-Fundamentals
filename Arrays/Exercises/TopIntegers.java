package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbersArr.length; i++) {
            boolean isTopInteger = true;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] <= numbersArr[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(numbersArr[i] + " ");
            }
        }
    }
}
