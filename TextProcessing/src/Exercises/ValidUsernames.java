package Exercises;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = sc.nextLine().split(", ");

        for (String username : usernames) {
            if (validateUsername(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean validateUsername(String username) {
        if (!(username.length() >= 3 && username.length() <= 16)) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)
                    && symbol != '-'
                    && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
