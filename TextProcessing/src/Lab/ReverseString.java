package Lab;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You will be given a series of strings until you receive an "end" command.
        Write a program that reverses strings and prints each pair on a separate line in the format "{word} = {reversed word}".
         */

        String command = sc.nextLine();

        while (!command.equals("end")) {
            StringBuilder sb = new StringBuilder(command);
            System.out.println(command + " = " + sb.reverse());
            command = sc.nextLine();
        }
    }
}
