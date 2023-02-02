package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that keeps track of guests going to a house party.
        On the first input line, you are going to receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:
        •	"{name} is going!"
        •	"{name} is not going!"
        If you receive the first type of input, you have to add the person if he/she is not on the list. If he/she is in the list, print on the console: "{name} is already in the list!". If you receive the second type of input, you must remove the person if he/she is on the list. If not, print: "{name} is not in the list!". In the end, print all guests

         */


        int n = Integer.parseInt(sc.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String name = input.split(" ")[0];
            if (!input.contains("not")) {
                if (!guests.contains(name)) {
                    guests.add(name);
                } else {
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                }
            } else {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();
                }
            }
        }
        for (String s : guests) {
            System.out.println(s);
        }
    }
}
