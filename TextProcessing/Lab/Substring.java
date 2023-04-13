package Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wordToRemove = sc.nextLine();
        String text = sc.nextLine();

        int index = text.indexOf(wordToRemove);
        while (index != -1) {
            text = text.replace(wordToRemove, "");
            index = text.indexOf(wordToRemove);
        }
        System.out.println(text);
    }
}
