package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that count all characters in a string except space (' ').
        Print all occurrences in the following format:
        char -> occurrences
         */

        String s = sc.nextLine().replaceAll("\\s+", "");
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
//            if (c == ' ') {
//                continue;
//            }
            occurrences.putIfAbsent(c, 0);
            occurrences.put(c, occurrences.get(c) + 1);
        }
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}