package Exercises;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        for (char symbol : text.toCharArray()) {
            System.out.print((char) (symbol + 3));
        }
    }
}
