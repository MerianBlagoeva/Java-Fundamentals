package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program to read an array of integers and condense them
        by summing adjacent couples of elements until a single integer is obtained.
        For example, if we have 3 elements {2, 10, 3},
        we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
        then we sum again all adjacent elements and obtain {12+13} = {25}.
         */

        int[] numbersArr = Arrays.
                        stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        while (numbersArr.length > 1) {
            int[] condensed = new int[numbersArr.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbersArr[i] + numbersArr[i + 1];
            }
            numbersArr = condensed;
        }
        System.out.println(numbersArr[0]);
    }
}
