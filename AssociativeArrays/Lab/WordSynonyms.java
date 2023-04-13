package Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that keeps a map with wordsMap. The key to the map will be the word. The value will be a list of all the wordsMap of that word. You will be given a number n. On the next 2 * n lines, you will be given the word and a synonym each on a separate line like this:
            •	{word}
            •	{synonym}
        If you get the same word for the second time, just add the new synonym to the list.
        Print the words in the following format:
        {word} - {synonym1, synonym2… synonymN}
         */

        int n = Integer.parseInt(sc.nextLine());


        LinkedHashMap<String, List<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList<>());
            }
            wordsMap.get(word).add(synonym);


//            List<String> values = wordsMap.get(word);
//            if (values == null) {
//                values = new ArrayList<>();
//                wordsMap.put(word, values);
//            }
//            values.add(synonym);
        }


        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}