package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbersArr.length; i++) {
             for (int j = i + 1; j < numbersArr.length; j++) {
                 if (numbersArr[i] + numbersArr[j] == n) {
                     System.out.print(numbersArr[i]+ " " + numbersArr[j]);
                     System.out.println();
                 }
             }
        }
    }
}
