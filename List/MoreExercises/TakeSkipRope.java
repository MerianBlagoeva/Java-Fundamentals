package MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        List<Integer> numbers = new ArrayList<>();
        List<String> nonNumbers = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                numbers.add(Integer.parseInt(String.valueOf(string.charAt(i))));
            } else {
                nonNumbers.add(String.valueOf(string.charAt(i)));
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }
//        TODO:
//        Example: "skipTest_String"
//        1.	Take 0 characters -> Taken: "", skip 4 characters  Skipped: "skip" -> Result: ""
//        2.	Take 4 characters -> Taken: "Test", skip 1 characters  Skipped: "_" -> Result: "Test"
//        3.	Take 7 characters -> Taken: "String", skip 0 characters  Skipped: "" -> Result: "TestString"
//        After that, just print the result string on the console.

    }
}
