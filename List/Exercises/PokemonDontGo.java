package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumOfRemovedNumbers = 0;
        while (list.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index <= list.size() - 1) {
                int removedElement = list.get(index);
                sumOfRemovedNumbers += removedElement;
                list.remove(index);
                modifyList(list, removedElement);

            } else if (index < 0) {
                int firstElement = list.get(0);
                sumOfRemovedNumbers += firstElement;
                list.remove(0);
                int lastElement = list.get(list.size() - 1);
                list.add(0, lastElement);
                modifyList(list, firstElement);

            } else if (index > list.size() - 1) {
                int lastNumber = list.get(list.size() - 1);
                sumOfRemovedNumbers += lastNumber;
                list.remove(list.size() - 1);
                int firstNumber = list.get(0);
                list.add(firstNumber);
                modifyList(list, lastNumber);
            }
        }
        System.out.println(sumOfRemovedNumbers);
    }

    public static void modifyList(List<Integer> list, int removedElement) {
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            list.set(i, currentNumber);
        }
    }
}
