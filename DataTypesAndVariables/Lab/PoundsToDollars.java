package Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double GBP = Double.parseDouble(sc.nextLine());

        double USD = GBP * 1.36;

        System.out.printf("%.3f", USD);
    }
}
