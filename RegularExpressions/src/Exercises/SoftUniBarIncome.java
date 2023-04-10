package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String customer = matcher.group("name");
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("count"));
                totalIncome += price * quantity;

                System.out.printf("%s: %s - %.2f%n", customer, product, price * quantity);
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
