package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Until you receive the "stop" command, you will be given a sequence of strings, each on a new line.
        Every odd line on the console represents a resource (e.g., Gold, Silver, Copper, etc.) and every even - quantity.
        Your task is to collect the resources and print them on a new line.
        Print the resources and their quantities in format: "{resource} –> {quantity}".
         */

        Map<String, Integer> resourceCounts = new LinkedHashMap<>();
        String command = sc.nextLine();
        int i = 1;
        String resource = null;

        while (!command.equals("stop")) {
            int quantity = 0;

            if (i % 2 != 0) {
                resource = command;
            } else {
                quantity = Integer.parseInt(command);
            }
            if (!resourceCounts.containsKey(resource)) {
                resourceCounts.put(resource, quantity);
            } else {
                int currentQuantity = resourceCounts.get(resource);
                resourceCounts.put(resource, currentQuantity + quantity);
            }

            i++;
            command = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
