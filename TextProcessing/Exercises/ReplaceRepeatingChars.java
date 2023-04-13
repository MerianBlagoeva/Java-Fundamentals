package Exercises;

import java.util.*;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        char firstOccur = text.charAt(0);

        sb.append(firstOccur);

        for (char symbol : text.toCharArray()) {
            if (symbol != firstOccur) {
                sb.append(symbol);
                firstOccur = symbol;
            }
        }
        System.out.println(sb);
    }
}
