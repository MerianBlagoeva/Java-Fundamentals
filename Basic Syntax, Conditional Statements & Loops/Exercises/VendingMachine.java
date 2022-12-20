package Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double moneyInserted = Double.parseDouble(input);
            if (moneyInserted == 0.1 || moneyInserted == 0.2 || moneyInserted == 0.5
                    || moneyInserted == 1 || moneyInserted == 2) {
                sum += moneyInserted;
            } else {
                System.out.printf("Cannot accept %.2f\n", moneyInserted);
            }
            input = sc.nextLine();
        }
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (sum >= 2) {
                        sum -= 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        sum -= 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Start":
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = sc.nextLine();
        }
        if (sum < 0) {
            sum = 0;
        }
        System.out.printf("Change: %.2f", sum);
    }
}
