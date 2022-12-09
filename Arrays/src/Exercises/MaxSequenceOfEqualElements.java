package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentStrike = 1;
        int longestStrike = 0;

        int currentStartIndex = 0;
        int longestStrikeStartIndex = 0;

        for (int i = 1; i < numbersArr.length; i++) {
            if (numbersArr[i] == numbersArr[i - 1]) {
                currentStrike++;
            } else {
                currentStrike = 1;
                currentStartIndex = i;
            }
            if (currentStrike > longestStrike) {
                longestStrike = currentStrike;
                longestStrikeStartIndex = currentStartIndex;
            }
        }
        for (int j = longestStrikeStartIndex; j < longestStrikeStartIndex + longestStrike; j++) {
            System.out.print(numbersArr[j] + " ");
        }

    }
}
