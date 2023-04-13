package Lab;

import java.util.Scanner;

public class BitDestroyer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program that sets the bit at position p to 0.

        int n = Integer.parseInt(sc.nextLine()); //125 /01111101
        int p = Integer.parseInt(sc.nextLine()); //5
        int mask = ~(1 << p); //1101111

        int result = n & mask; // 01011101
        System.out.println(result);

    }
}
