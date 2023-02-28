package Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int digit = scanner.nextInt();

//        String[] digitNames = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        System.out.println(digitNames[digit]);

        String digitName = scanner.nextLine();

        Map<String, Integer> digitValues= new HashMap<>();
        digitValues.put("zero", 0);
        digitValues.put( "one", 1);
        digitValues.put("two", 2);
        digitValues.put("three", 3);
        digitValues.put("five", 5);

        System.out.println(digitValues.get(digitName));


    }
}
