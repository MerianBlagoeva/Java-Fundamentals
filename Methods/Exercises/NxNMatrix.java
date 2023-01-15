package Exercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a method that receives a single integer n and prints a nxn matrix with that number.
         */

        int num = Integer.parseInt(sc.nextLine());
        printNxNMatrix(num);

    }
    public static void printNxNMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
