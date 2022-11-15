package Exercises;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        int count = 0;
        int originalPokePower = pokePower;

        while (pokePower >= distance) {
            pokePower -= distance;
            count++;

            if (pokePower == originalPokePower * 0.50) {
                if (exhaustionFactor > 0) {
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}
