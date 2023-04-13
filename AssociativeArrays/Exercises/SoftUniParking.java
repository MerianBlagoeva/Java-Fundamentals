package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, String> registrations = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String username = command.split(" ")[1];
            if (!command.contains("unregister")) {
                String licensePlateNumber = command.split(" ")[2];

                if (!registrations.containsKey(username)) {
                    registrations.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", registrations.get(username));
                }
            } else {
                if (!registrations.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registrations.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        registrations.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
