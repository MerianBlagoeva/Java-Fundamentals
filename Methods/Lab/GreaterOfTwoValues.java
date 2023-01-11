package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You are given two values of the same type as input.
        The values can be of type int, char of String.
        Create a method getMax() that returns the greater of the two values:
         */

        String type = sc.nextLine();


        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(sc.nextLine());
                int secondNum = Integer.parseInt(sc.nextLine());

                System.out.println(getMax(firstNum, secondNum));

                break;

            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);

                System.out.println(getMax(firstChar, secondChar));

                break;

            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();

                System.out.println(getMax(firstString, secondString));



                break;
        }
    }
    public static int getMax(int first, int second) {
        return Math.max(first, second);
    }
    public static char getMax(char first, char second) {
        return (first > second) ? first : second;
    }
    public static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }
    }
}
