package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create a method that calculates and returns the value of a number raised to a given power.

        double base = Double.parseDouble(sc.nextLine());
        double power = Double.parseDouble(sc.nextLine());

        double result = mathPower(base, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double mathPower(double base, double power) {
//        return Math.pow(base, power);

        double result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }
}
