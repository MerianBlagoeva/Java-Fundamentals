package Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        String biggest = "";

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > max) {
                max = volume;
                biggest = model;
            }
        }
        System.out.println(biggest);
    }
}
