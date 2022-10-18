package Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        int n = Integer.parseInt(sc.nextLine());
        int multiplier = Integer.parseInt(sc.nextLine());

        for (int i = multiplier; i <= 10; i++) {
            result = n * i;
            System.out.printf("%d X %d = %d\n", n, i, result);
        }
        if (multiplier > 10) {
            result = n * multiplier;
            System.out.printf("%d X %d = %d\n", n, multiplier, result);
        }
    }
}
