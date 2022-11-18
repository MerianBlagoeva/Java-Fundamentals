package Exercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yield = Integer.parseInt(sc.nextLine());
        int days = 0;
        int totalSpices = 0;
        while (yield >= 100) {
            int spices = yield - 26;
            totalSpices += spices;
            days++;
            yield -= 10;
        }
        System.out.println(days);
        if (totalSpices >= 26) {
            totalSpices -= 26;
        }
        System.out.println(totalSpices);
    }
}
