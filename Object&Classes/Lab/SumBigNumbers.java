package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You will receive two numbers (0 to 1050), and print their sum.
         */

        BigInteger firstNum = new BigInteger(sc.nextLine());
        BigInteger secondNum = new BigInteger(sc.nextLine());

        BigInteger sum = firstNum.add(secondNum);
        System.out.println(sum);
    }
}
