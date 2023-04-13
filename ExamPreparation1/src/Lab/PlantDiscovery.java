package Lab;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Integer>> plantsRatings = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String info = sc.nextLine();
            String[] tokens = info.split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plantsRarity.put(plant, rarity);
            plantsRatings.put(plant, new ArrayList<>());
        }
        String command = sc.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandParts = command.split(": ");
            switch (commandParts[0]) {
                case "Rate":
                    String[] parts1 = commandParts[1].split(" - ");
                    String plantName = parts1[0];
                    int rating = Integer.parseInt(parts1[1]);
                    if (plantsRarity.containsKey(plantName)) {
                        plantsRatings.get(plantName).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] parts2 = commandParts[1].split(" - ");
                    String plant = parts2[0];
                    int newRarity = Integer.parseInt(parts2[1]);

                    if (plantsRarity.containsKey(plant)) {
                        plantsRarity.put(plant, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plant3 = commandParts[1];
                    if (plantsRarity.containsKey(plant3)) {
                        plantsRatings.get(plant3).clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }

            command = sc.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarity.forEach((key, value) -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", key, value, findAverage(plantsRatings.get(key))));

    }
    public static double findAverage(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        if (sum != 0) {
            return 1.00 * sum / list.size();
        }
        return 0.00;
    }
}
