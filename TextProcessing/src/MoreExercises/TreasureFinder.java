package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] key = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = sc.nextLine();

        String regex = "&(?<treasure>[A-Za-z]+)&[A-Za-z]+<(?<coordinates>[A-Za-z0-9]+)>";
        Pattern pattern = Pattern.compile(regex);



        while (!input.equals("find")) {
            char[] inputArray = input.toCharArray();
            StringBuilder sb = new StringBuilder();

            int keyIndex = 0;
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = (char) (inputArray[i] - key[keyIndex]);
                sb.append(inputArray[i]);
                keyIndex++;
                if (keyIndex == key.length) {
                    keyIndex = 0;
                }
            }
//            String s = Arrays.toString(inputArray).replaceAll("[\\[\\],\s]", "");
            Matcher matcher = pattern.matcher(sb);
            while (matcher.find()) {
                System.out.printf("Found %s at %s%n", matcher.group("treasure"), matcher.group("coordinates"));
            }
            input = sc.nextLine();
        }
    }
}
