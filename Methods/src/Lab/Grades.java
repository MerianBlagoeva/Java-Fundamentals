package Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

            /*
            Write a method that receives a grade between 2.00 and 6.00
            and prints the corresponding grade in words:
            •	2.00 – 2.99 - "Fail"
            •	3.00 – 3.49 - "Poor"
            •	3.50 – 4.49 - "Good"
            •	4.50 – 5.49 - "Very good"
            •	5.50 – 6.00 - "Excellent"
             */

        Scanner sc = new Scanner(System.in);
        double grade = Double.parseDouble(sc.nextLine());

        printGradeInWords(grade);
    }
    public static void printGradeInWords(double grade) {
        if (grade >= 2 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade <= 4.49) {
            System.out.println("Good");
        } else if (grade <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
