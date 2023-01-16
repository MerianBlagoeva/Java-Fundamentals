package Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that checks if a given password is valid. Password rules are:
     •	6 – 10 characters (inclusive);
     •	Consists only of letters and digits;
     •	Have at least 2 digits.

     If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule, print a message:
     •	"Password must be between 6 and 10 characters";
     •	"Password must consist only of letters and digits";
     •	"Password must have at least 2 digits".

         */

        String password = sc.nextLine();
        validatePassword(password);

    }

    public static void validatePassword(String pass) {

        boolean isWantedLength = true;

        if (!(pass.length() >= 6 && pass.length() <= 10)) {
            System.out.println("Password must be between 6 and 10 characters");
            isWantedLength = false;
        }

        int count = 0;
        boolean containsOnlyDigitsAndLetters = true;

        for (char c : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                containsOnlyDigitsAndLetters = false;
            }
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (!containsOnlyDigitsAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean hasTwoDigits = true;
        if (count < 2) {
            System.out.println("Password must have at least 2 digits");
            hasTwoDigits = false;
        }

        if (containsOnlyDigitsAndLetters && hasTwoDigits && isWantedLength) {
            System.out.println("Password is valid");
        }
    }
}