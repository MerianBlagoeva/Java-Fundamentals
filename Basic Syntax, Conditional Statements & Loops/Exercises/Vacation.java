package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        String day = sc.nextLine();

        double total = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        total = people * 8.45;
                        break;
                    case "Saturday":
                        total = people * 9.80;
                        break;
                    case "Sunday":
                        total = people * 10.46;
                        break;
                }
                if (people >= 30) {
                    total *= 0.85;
                }
                break;
            case "Business":
                if (people >= 100) {
                    people -= 10;
                }
                switch (day) {
                    case "Friday":
                        total = people * 10.90;
                        break;
                    case "Saturday":
                        total = people * 15.60;
                        break;
                    case "Sunday":
                        total = people * 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        total = people * 15;
                        break;
                    case "Saturday":
                        total = people * 20;
                        break;
                    case "Sunday":
                        total = people * 22.50;
                        break;
                }
                if (people >= 10 && people <= 20) {
                    total *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", total);
    }
}
