package Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int startNumber = number;



        int sum = 0;


        while (number > 0) {
            int lastDigit = number % 10;
            int currentFactorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                currentFactorial = currentFactorial * i;
            }
            sum += currentFactorial;
            number /= 10;
        }
        if (sum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
