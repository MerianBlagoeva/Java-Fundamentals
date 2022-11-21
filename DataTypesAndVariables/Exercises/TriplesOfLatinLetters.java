package Exercises;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int letter1 = 'a'; letter1 < 'a' + n; letter1++) {
            for (int letter2 = 'a'; letter2 < 'a' + n; letter2++) {
                for (int letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    System.out.printf("%c%c%c%n", letter1, letter2, letter3);
                }
            }
        }
    }
}
