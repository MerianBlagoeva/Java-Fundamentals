package Exercises;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startIndex = Integer.parseInt(sc.nextLine());
        int lastIndex = Integer.parseInt(sc.nextLine());

        for (int i = startIndex; i <= lastIndex; i++) {
            System.out.printf("%c ", i);
        }
    }
}
