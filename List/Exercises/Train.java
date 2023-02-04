package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
    On the first line, you will be given a list of wagons (integers). Each integer represents the number of passengers that are currently in each wagon.
    On the next line, you will get the max capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:
    •	Add {passengers} - add a wagon to the end with the given number of passengers
    •	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
    In the end, print the final state of the train (all the wagons separated by a space)

         */
        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        while(!input.equals("end")) {
            String[] inputParts = input.split(" ");

            if (inputParts[0].equals("Add")) {
                int newWagon = Integer.parseInt(inputParts[1]);
                wagons.add(newWagon);
            } else {
                int passengers = Integer.parseInt(inputParts[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }
            input = sc.nextLine();

        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));

    }
}
