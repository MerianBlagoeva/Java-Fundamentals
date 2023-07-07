package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("Finish")) {
            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Add":
                    add(commandParts, numbersList);
                    break;
                case "Remove":
                    remove(commandParts, numbersList);
                    break;
                case "Replace":
                    replace(commandParts, numbersList);
                    break;
                case "Collapse":
                    collapse(commandParts, numbersList);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void add(String[] commandParts, List<Integer> list) {
        list.add(Integer.parseInt(commandParts[1]));
    }

    public static void remove(String[] commandParts, List<Integer> list) {
        list.remove(Integer.valueOf(Integer.parseInt(commandParts[1])));

    }

    public static void replace(String[] commandParts, List<Integer> list) {
        int number = Integer.parseInt(commandParts[2]);
        int index = list.indexOf(Integer.valueOf(commandParts[1]));
        list.remove(index);
        list.add(index, number);
    }

    public static void collapse(String[] commandParts, List<Integer> list) {
        int number = Integer.parseInt(commandParts[1]);
        list.removeIf(e -> e < number);
    }
}
