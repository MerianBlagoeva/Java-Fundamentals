package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d]+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        double moneySpend = 0;
        System.out.println("Bought furniture: ");
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                moneySpend += price * quantity;

                System.out.println(furnitureName);
            }

            input = sc.nextLine();
        }
        System.out.printf("Total money spend: %.2f", moneySpend);

    }
}