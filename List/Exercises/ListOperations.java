package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You will be given numbers (a list of integers) on the first input line. Until you receive "End" you will be given operations you must apply on the list. The possible commands are:
            •	Add {number} - add number at the end
            •	Insert {number} {index} - insert number at given index
            •	Remove {index} - remove that index
            •	Shift left {count} - first number becomes last 'count' times
            •	Shift right {count} - last number becomes first 'count' times
        Note: The index given may be outside the array's bounds. In that case, print "Invalid index".
         */
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] commandParts = input.split(" ");
            switch (commandParts[0]) {
                case "Add":
                    add(commandParts, numbersList);
                    break;
                case "Insert":
                    insert(commandParts, numbersList, input);
                    break;
                case "Remove":
                    remove(commandParts, numbersList);
                    break;
                case "Shift":
                    shift(commandParts, numbersList);
                    break;
            }

            input = sc.nextLine();
        }
        for (int i : numbersList) {
            System.out.print(i + " ");
        }
    }

    public static void add(String[] commandParts, List<Integer> list) {
        int number = Integer.parseInt(commandParts[1]);
        list.add(number);
    }

    public static void insert(String[] commandParts, List<Integer> list, String input) {
        int number = Integer.parseInt(input.split("\\s+")[1]);
        int index = Integer.parseInt(commandParts[commandParts.length - 1]);
        if (checkIndex(index, list))
            list.add(index, number);
    }

    public static void remove(String[] commandParts, List<Integer> list) {
        int index = Integer.parseInt(commandParts[1]);
        if (checkIndex(index, list))
            list.remove(index);
    }

    public static void shift(String[] commandParts, List<Integer> list) {
        int count = Integer.parseInt(commandParts[2]);
        if (commandParts[1].equals("left")) {
            for (int i = 0; i < count; i++) {
                int firstNumber = list.get(0);
                list.remove(0);
                list.add(firstNumber);
            }
        } else {
            for (int i = 0; i < count; i++) {
                int lastNumber = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                list.add(0, lastNumber);
            }
        }
    }

    public static boolean checkIndex(int index, List<Integer> list) {
        if (index >= 0 && index < list.size()) {
            return true;
        }
        System.out.println("Invalid index");
        return false;
    }
}
