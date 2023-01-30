package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that reads a list of integers from the console and receives commands which manipulate the list. Your program may receive the following commands:
        •	Delete {element} - delete all elements in the array which are equal to the given element
        •	Insert {element} {position} - insert element at the given position
        You should stop the program when you receive the command "end". Print all numbers in the array, separated with a single whitespace.

         */

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Delete":
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbersList.removeAll(Arrays.asList(numberToRemove));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandParts[1]);
                    int index = Integer.parseInt(commandParts[2]);
                    numbersList.add(index, element);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
