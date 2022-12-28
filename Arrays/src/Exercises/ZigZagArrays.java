package Hello;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        int[] firstArr = new int[n];
        int[] secondArr = new int[n];


        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");

            if (i % 2 != 0) {
                firstArr[i - 1] = Integer.parseInt(numbers[0]);
                secondArr[i - 1] = Integer.parseInt(numbers[1]);
            } else {
                firstArr[i - 1] = Integer.parseInt(numbers[1]);
                secondArr[i - 1] = Integer.parseInt(numbers[0]);
            }
        }

        printArray(firstArr);
        printArray(secondArr);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
