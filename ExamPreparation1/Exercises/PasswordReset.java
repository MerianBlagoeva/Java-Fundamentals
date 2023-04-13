package Exercises;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        String command = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!command.equals("Done")) {
            String[] commandParts = command.split("\\s+");
            switch (commandParts[0]) {
                case "TakeOdd":
                    for (int i = 1; i < password.length(); i+=2) {
                        sb.append(password.charAt(i));
                    }
                    password = sb.toString();
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);
                    String substring = password.substring(index, index + length);
                    password = password.replaceFirst(substring, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String subString = commandParts[1];
                    String substitute = commandParts[2];

                    if (password.contains(subString)) {
                        password = password.replace(subString, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = sc.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
