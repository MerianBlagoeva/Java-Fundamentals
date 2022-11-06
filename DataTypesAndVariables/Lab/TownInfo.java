package Lab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String townName = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        short area = Short.parseShort(sc.nextLine());

      //  System.out.printf("Town %s has population of %d and area %s square km.", townName, population, area);

        String info = String.format("Town %s has population of %d and area %s square km.", townName, population, area);
        System.out.println(info);
    }
}
