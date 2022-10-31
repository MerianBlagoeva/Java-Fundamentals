package Lab;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);

        if (c >= 65 && c <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
//        if (Character.isLowerCase(c)) {
//            System.out.println("lower-case");
//        } else {
//            System.out.println("upper-case");
//        }
    }
}
