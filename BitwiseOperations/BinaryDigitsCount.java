package Lab;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int binary = Integer.parseInt(sc.nextLine());

        int count = 0;
        while (n > 0) {
            if (n % 2 == binary) {
                count++;
            }
            n /= 2;
        }
        System.out.println(count);
    }
}
