package Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 10; i++) {
           int result = i * n;
            System.out.printf("%d X %d = %d\n", n, i, result);
        }
    }
}
