package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class OddTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;
        for (int i = 0; i < array.length; i++) {

        }
    }
}
