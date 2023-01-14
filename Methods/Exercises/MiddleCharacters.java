package Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You will receive a single string. Write a method that prints the middle character.
        If the length of the string is even, there are two middle characters.
         */

        String text = sc.nextLine();
        printMiddleChar(text);

    }
    public static void printMiddleChar(String s) {
        String[] text = s.split("");
        if (s.length() % 2 != 0) {
            System.out.println(text[text.length / 2]);
        } else {
            System.out.print(text[s.length() / 2 - 1]);
            System.out.println(text[s.length() / 2]);
        }
    }
}
