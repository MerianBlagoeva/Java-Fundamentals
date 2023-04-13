package Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that extracts from a given sequence of words all elements that are present in it an odd number of times (case-insensitive).
           •	Words are given in a single line, space-separated.
           •	Print the result elements in lowercase in their order of appearance.
          */

        String[] input = sc.nextLine().split(" ");

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();
        for (String word : input) {
            word = word.toLowerCase();
            words.putIfAbsent(word, 0);
            words.put(word, words.get(word) + 1);

//            if (!words.containsKey(word)) {
//                words.put(word, 0);
//            }
//            words.put(word, words.get(word) + 1);

        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", result));
    }
}
