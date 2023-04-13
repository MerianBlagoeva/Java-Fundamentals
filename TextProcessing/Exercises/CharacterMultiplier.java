package Exercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] strings = input.split(" ");

        System.out.println(getSum(strings[0], strings[1]));
    }

    public static int getSum(String first, String second) {
        int minLength = Math.min(first.length(), second.length());
        String longest = first.length() > second.length() ? first : second;

        int sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        for (int i = minLength; i < longest.length(); i++) {
            sum += longest.charAt(i);
        }
        return sum;
    }
}
