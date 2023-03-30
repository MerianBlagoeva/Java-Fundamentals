package Lab;

import java.util.Scanner;

public class BitAtPositionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that prints the bit at position 1 of the given integer. We use the standard counting: from right to left, starting from 0.
         */
        int n = Integer.parseInt(sc.nextLine());

        int bitAtPosition1 = n >> 1; //местим битовете с 1 наляво за да може този на първа позиция да стане последен
        bitAtPosition1 = n & 1; //намираме последния бит
        System.out.println(bitAtPosition1);
    }
}
