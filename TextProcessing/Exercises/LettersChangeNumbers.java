package Exercises;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] strings = input.split("\\s+");

        double totalSum = 0;

        for (String s : strings) {
            double modifiedNumber = getModifiedNumber(s);
            totalSum += modifiedNumber;

        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String s) {
        char firstLetter = s.charAt(0);
        char secondLetter = s.charAt(s.length() - 1);
        double number = Double.parseDouble(s.replace(firstLetter, ' ')
                .replace(secondLetter, ' ')
                .trim());

        if (Character.isUpperCase(firstLetter)) {
            number /= getPosition(firstLetter);
        } else {
            number *= getPosition(firstLetter);
        }

        if (Character.isUpperCase(secondLetter)) {
            number -= getPosition(secondLetter);
        } else {
            number += getPosition(secondLetter);
        }
        return number;
    }

    public static int getPosition(char letter) {
        return Character.toLowerCase(letter) - 96;
    }
}
