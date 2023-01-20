package MoreExercises;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        System.out.printf("(%s)", findCloserToCenterCoordinates(x1, y1, x2, y2));
    }

    static String findCloserToCenterCoordinates(int x1, int y1, int x2, int y2) {
        int firstPoint = x1 + y1;
        int secondPoint = x2 + y2;

        if (firstPoint < secondPoint) {
            return x1 + ", " + y1;
        } else {
            return x2 + ", " + y2;
        }
    }
}
