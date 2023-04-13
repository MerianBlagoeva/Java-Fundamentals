package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String regex = "([|#])(?<item>[A-Za-z\\s]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder output = new StringBuilder();

        int totalCalories = 0;
        while (matcher.find()) {
            String item = matcher.group("item");
            String date  = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", item, date, calories));

        }
        int days = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(output);


    }
}
