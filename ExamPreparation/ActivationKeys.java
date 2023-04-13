package Lab;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String activationKey = sc.nextLine();

        String command = sc.nextLine();

        while (!command.equals("Generate")) {
            String[] commandParts = command.split(">>>");
            switch (commandParts[0]) {
                case "Contains":
                    if (activationKey.contains(commandParts[1])) {
                        System.out.printf("%s contains %s%n", activationKey, commandParts[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(commandParts[2]);
                    int endIndex = Integer.parseInt(commandParts[3]);
                    String substring = activationKey.substring(startIndex, endIndex);

                    switch (commandParts[1]) {
                        case "Upper":
                            activationKey = activationKey.replace(substring, substring.toUpperCase());
                            break;
                        case "Lower":
                            activationKey = activationKey.replace(substring, substring.toLowerCase());
                            break;
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int start = Integer.parseInt(commandParts[1]);
                    int end = Integer.parseInt(commandParts[2]);

                    String subString = activationKey.substring(start, end);
                    activationKey = activationKey.replace(subString, "");
                    System.out.println(activationKey);
                    break;
            }

            command = sc.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
