package Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a program to read an array of strings, reverse it and print its elements.
        The input consists of a sequence of space-separated strings.
        Print the output on a single line (space separated).
         */

       String[] inputArr = sc.nextLine().split(" ");

       for (int i = 0; i < inputArr.length / 2; i++) {
           String oldElement = inputArr[i];
           inputArr[i] = inputArr[inputArr.length - 1 - i];
           inputArr[inputArr.length - 1 - i] = oldElement;
       }
       System.out.println(String.join(" ", inputArr));

    }
}
