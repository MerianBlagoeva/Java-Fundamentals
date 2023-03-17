package Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (String word : bannedWords) {
            if (text.contains(word)) {
                text = text.replace(word, repeatString("*", word.length()));
            }
        }
        System.out.println(text);
    }
    public static String repeatString(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }
}
