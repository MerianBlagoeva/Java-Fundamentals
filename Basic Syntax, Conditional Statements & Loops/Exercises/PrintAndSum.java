package Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int sum  = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
