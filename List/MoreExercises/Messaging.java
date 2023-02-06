package MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String message = sc.nextLine();

        StringBuilder result = new StringBuilder();
        StringBuilder mess = new StringBuilder(message);
        for (int number : numbersList) {
            int index = findIndex(number);
            if (index > message.length()) {
                index -= message.length();
            }
            result.append(message.charAt(index));
            message = mess.deleteCharAt(index).toString();
        }
        System.out.println(result);

    }

    public static int findIndex(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
