package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You are given a list of words in one line. Randomize their order and print each word on a separate line.You are given a list of words in one line.
        Randomize their order and print each word on a separate line.
         */

        String[] words = sc.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int pos2 = rnd.nextInt(words.length);

            String oldWord = words[pos2];

            words[pos2] = words[i];
            words[i] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), words));



    }
}
