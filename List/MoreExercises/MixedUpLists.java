package MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> first = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> second = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxLength = Math.max(first.size(), second.size());

        int firstNum;
        int secondNum;

        if (first.size() == maxLength) {
            firstNum = first.get(first.size() - 1);
            secondNum = first.get(first.size() - 2);

        } else {
            firstNum = second.get(0);
            secondNum = second.get(1);

        }

        List<Integer> newList = new ArrayList<>(first);
        newList.addAll(second);

        printElements(newList, firstNum, secondNum);

    }

    public static void printElements(List<Integer> list, int a, int b) {
        int biggerNumber = Math.max(a, b);
        int smallerNumber = Math.min(a, b);
        List<Integer> result = new ArrayList<>();
        for (int number : list) {
            if (number > smallerNumber && number < biggerNumber) {
                result.add(number);
            }
        }
        Collections.sort(result);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
