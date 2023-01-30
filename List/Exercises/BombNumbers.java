package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that reads a sequence of numbers and a special bomb number with a certain power.
        Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right.
        Detonations are performed from left to right, and all detonated numbers disappear.
        Finally, print the sum of the remaining elements in the sequence.
         */

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();
        int bombNumber = Integer.parseInt(input.split(" ")[0]);
        int power = Integer.parseInt(input.split(" ")[1]);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == bombNumber) {
                int endIndex;
                if (i + power < list.size()) {
                    endIndex = i + power + 1;
                } else {
                    endIndex = list.size();
                }
                int startIndex = Math.max(i - power, 0);
                List<Integer> subList = new ArrayList<>(list.subList(startIndex, endIndex));
                for (Integer integer : subList) {
                    list.remove(integer);
                    i = - 1;
                }
            }
        }
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        System.out.println(sum);
    }
}
