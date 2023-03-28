package Exercises;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder text = new StringBuilder(input);

        int totalPower = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == '>') {
                int power = Integer.parseInt(text.charAt(i + 1) + "");
                totalPower += power;
            } else if (totalPower > 0) {
                text.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(text);
    }
}
