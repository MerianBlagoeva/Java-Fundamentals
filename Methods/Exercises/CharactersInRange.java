package Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a method that receives two characters and prints all the characters
        between them on a single line according to ASCII.
         */

        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);

        printCharactersInRange(start, end);

    }

    public static void printCharactersInRange(char first, char second) {
        int start = Math.min(first, second);
        int end = Math.max(first, second);
        for (int i = start + 1; i < end; i++) {
            System.out.print(((char) i + " "));
        }
    }
}
