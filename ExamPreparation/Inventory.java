import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inventory = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("Craft!")) {
            String[] commandParts = input.split(" - ");
            switch (commandParts[0]) {
                case "Collect":
                    collect(commandParts, inventory);
                    break;
                case "Drop":
                    drop(commandParts, inventory);
                    break;
                case "Combine Items":
                    combine(commandParts, inventory);
                    break;
                case "Renew":
                    renew(commandParts, inventory);
                    break;
            }

            input = sc.nextLine();
        }
        for (int i = 0; i < inventory.size(); i++) {
            if (i == inventory.size() - 1) {
                System.out.print(inventory.get(i));
            } else {
                System.out.print(inventory.get(i) + ", ");
            }
        }
    }

    public static void collect(String[] commandParts, List<String> inventory) {
        String item = commandParts[1];
        if (!inventory.contains(item))
            inventory.add(item);
    }

    public static void drop(String[] commandParts, List<String> inventory) {
        String item = commandParts[1];
        inventory.remove(item);
    }

    public static void combine(String[] commandParts, List<String> inventory) {
        String items = commandParts[1];
        String[] separatedItems = items.split(":");
        String oldItem = separatedItems[0];
        String newItem = separatedItems[1];

        if (inventory.contains(oldItem)) {
            int oldItemIndex = inventory.indexOf(oldItem);
            inventory.add(oldItemIndex + 1, newItem);
        }
    }

    public static void renew(String[] commandParts, List<String> inventory) {
        String item = commandParts[1];
        if (inventory.contains(item)) {
            inventory.remove(item);
            inventory.add(item);
        }
    }
}
