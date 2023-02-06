package MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < array.length / 2; i++) {
            left.add(array[i]);
            right.add(array[array.length - i - 1]);
        }
        String winner = calculateTime(left) < calculateTime(right) ? "left" : "right";
        double winningTime = Math.min(calculateTime(left), calculateTime(right));

        System.out.printf("The winner is %s with total time: %.1f", winner, winningTime);

    }
    public static double calculateTime(List<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum += number;
            if (number == 0) {
                sum *= 0.8;
            }
        }
        return sum;
    }
}
