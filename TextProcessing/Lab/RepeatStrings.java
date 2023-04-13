package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a Program That Reads an Array of Strings. Each String is Repeated N Times, Where N is the length of the String. Print the Concatenated String.
         */
        String[] strings = sc.nextLine().split(" ");
        List<String> repeat = new ArrayList<>();

        for (String currentWord : strings) {
            String repeatWord = repeatString(currentWord, currentWord.length());
            repeat.add(repeatWord);
        }
        System.out.println(String.join("", repeat));
    }
    public static String repeatString(String word, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
        }
        return result;
    }
}
