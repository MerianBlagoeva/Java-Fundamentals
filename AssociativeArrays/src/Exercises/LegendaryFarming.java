package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();
        boolean wonItem = false;

        do {
            String input = sc.nextLine();
            String[] tokens = input.split(" ");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();
                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        int currentQuantity = items.get(material);
                        items.put(material, currentQuantity + quantity);
                        break;
                    default:
                        if (!junkItems.containsKey(material)) {
                            junkItems.put(material, quantity);
                        } else {
                            int currentQuantityJunk = junkItems.get(material);
                            junkItems.put(material, currentQuantityJunk + quantity);
                        }
                }
                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    wonItem = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    wonItem = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    wonItem = true;
                    break;
                }
            }

        } while (!wonItem);

        items.forEach((key, value) ->
                System.out.printf("%s: %d%n", key, value));

        junkItems.forEach((key, value) ->
                System.out.printf("%s: %d%n", key, value));
    }
}