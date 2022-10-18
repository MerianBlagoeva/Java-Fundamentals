package Lab;

import java.util.Scanner;

public class Passes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        }
    }
}
