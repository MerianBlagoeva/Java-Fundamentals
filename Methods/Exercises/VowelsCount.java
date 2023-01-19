package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a method that receives a single string and prints the count of the vowels.
        Use an appropriate name for the method.
         */

        String text = sc.nextLine();
        text = text.toLowerCase();
        printVowelsCount(text);

    }
    public static void printVowelsCount(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
