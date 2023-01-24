package Lab;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
            Add {number}: add a number to the end of the list
            Remove {number}: remove a number from the list
            RemoveAt {index}: remove a number at a given index
            Insert {number} {index}: insert a number at a given index
            Note: All the indices will be valid!
        When you receive the "end" command, print the final state of the list (separated by spaces).

         */

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];
            switch (action) {
                case "Add":
                    numbersList.add(Integer.parseInt(commandParts[1]));
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandParts[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    numbersList.remove(Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int index = Integer.parseInt(commandParts[2]);
                    numbersList.add(index, numberToInsert);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }

}
