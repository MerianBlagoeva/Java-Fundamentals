package Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int litres = Integer.parseInt(sc.nextLine());
            sum += litres;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= litres;
            }
        }
        System.out.println(sum);
    }
}
