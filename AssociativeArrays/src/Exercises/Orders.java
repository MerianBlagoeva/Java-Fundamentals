package Exercises;


import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, Double> orders = new LinkedHashMap<>();
        Map<String, Integer> rememberProducts = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String[] commandParts = command.split(" ");
            String product = commandParts[0];
            double price = Double.parseDouble(commandParts[1]);
            int quantity = Integer.parseInt(commandParts[2]);

            if (!orders.containsKey(product)) {
                orders.put(product, quantity * price);
                rememberProducts.put(product, quantity);
            } else {
                rememberProducts.put(product, rememberProducts.get(product) + quantity);
                orders.put(product, rememberProducts.get(product) * price);
            }

            command = sc.nextLine();
        }
        orders.forEach((key, value) ->
                System.out.printf("%s -> %.2f%n", key, value));
    }
}

