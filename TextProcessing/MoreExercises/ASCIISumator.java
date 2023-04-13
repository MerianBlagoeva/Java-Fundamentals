package MoreExercises;

import java.util.Scanner;

public class ASCIISumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);
        String text = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > first && text.charAt(i) < second) {
                sum += text.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
