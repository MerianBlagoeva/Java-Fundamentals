package MoreExercises;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String text = sc.nextLine();

            String name = text.substring(text.indexOf('@') + 1, text.indexOf('|'));
            String age = text.substring(text.indexOf('#') + 1, text.indexOf('*'));

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
