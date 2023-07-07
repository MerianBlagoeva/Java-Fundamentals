package Problems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int days = Integer.parseInt(sc.nextLine());
        int players = Integer.parseInt(sc.nextLine());
        double energy = Double.parseDouble(sc.nextLine());
        double waterPerDayForOne = Double.parseDouble(sc.nextLine());
        double foodPerDayForOne = Double.parseDouble(sc.nextLine());

        double allWater = days * waterPerDayForOne * players;
        double allFood = days * foodPerDayForOne * players;


        boolean haveEnoughEnergy = true;
        for (int day = 1; day <= days; day++) {
            double energyLossChopping = Double.parseDouble(sc.nextLine());
            if (energy - energyLossChopping <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", allFood, allWater);
                haveEnoughEnergy = false;
                break;
            }
            energy -= energyLossChopping;
            if (day % 2 == 0) {
                energy += energy * 0.05;

                allWater -= allWater * 0.30;
            }
            if (day % 3 == 0) {
                allFood -= (allFood / players);
                energy += energy * 0.10;
            }
        }

        if (haveEnoughEnergy) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
    }
}
