package Exercises;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, List<String>> sideMembers = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains("|")) {
                String side = command.split(" \\| ")[0];
                String user = command.split(" \\| ")[1];

                if (!sideMembers.containsKey(side)) {
                    sideMembers.put(side, new ArrayList<>());
                }
                boolean isUserExisting = false;
                for (List<String> users : sideMembers.values()) {
                    if (users.contains(user)) {
                        isUserExisting = true;
                        break;
                    }
                }
                if (!isUserExisting) {
                    sideMembers.get(side).add(user);
                }
            } else if (command.contains("->")) {
                String user = command.split("\\s+->\\s+")[0];
                String side = command.split("\\s+->\\s+")[1];

                sideMembers.forEach((key, value) -> value.remove(user));

                if (sideMembers.containsKey(side)) {
                    sideMembers.get(side).add(user);
                } else {
                    sideMembers.put(side, new ArrayList<>());
                    sideMembers.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            command = sc.nextLine();
        }
        sideMembers.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
