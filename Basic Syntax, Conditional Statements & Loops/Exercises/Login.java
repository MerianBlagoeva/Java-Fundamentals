package Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        int count = 0;

        String pass = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            pass += username.charAt(i);
        }
        String enteredPassword = sc.nextLine();
        while (!enteredPassword.equals(pass)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword = sc.nextLine();
        }
        if (count < 4)
            System.out.printf("User %s logged in.", username);
    }
}
