package Lab;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
            Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
            Print even – print all the numbers that are even separated by a space
            Print odd – print all the numbers that are oddly separated by a space
            Get sum – print the sum of all the numbers
            Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="

         */

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] commandParts = input.split(" ");
            switch (commandParts[0]) {
                case "Contains":
                    printWhetherContainsNumber(numbersList, commandParts[1]);
                    break;
                case "Print":
                    printEvenOrOdd(numbersList, commandParts[1]);
                    break;
                case "Get":
                    printSum(numbersList);
                    break;
                case "Filter":
                    filter(numbersList, commandParts[1], commandParts[2]);
                    break;
            }

            input = sc.nextLine();
        }
    }

    public static void printWhetherContainsNumber(List<Integer> list, String n) {
        if (list.contains(Integer.parseInt(n))) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenOrOdd(List<Integer> list, String evenOrOdd) {

        int parity = (evenOrOdd.equals("even") ? 1 : 0);
        for (int i : list) {
            if (i % 2 != parity) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void filter(List<Integer> list, String condition, String number) {
        List<Integer> copyList = new ArrayList<>(list);

        int num = Integer.parseInt(number);
        switch (condition) {
            case "<":
                copyList.removeIf(e -> e >= num);
                break;
            case ">":
                copyList.removeIf(e -> e <= num);
                break;
            case ">=":
                copyList.removeIf(e -> e < num);
                break;
            case "<=":
                copyList.removeIf(e -> e > num);
                break;
        }
        printList(copyList);
    }

    public static void printList(List<Integer> list) {
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

}
