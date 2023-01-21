package MoreExercises;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        int z1 = Integer.parseInt(sc.nextLine());
        int w1 = Integer.parseInt(sc.nextLine());
        int z2 = Integer.parseInt(sc.nextLine());
        int w2 = Integer.parseInt(sc.nextLine());


        if (lineLength(x1, y1, x2, y2) >= lineLength(z1, w1, z2, w2)) {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", z2, w2, z1, w1);
        }
        //?? не работи

    }

    private static int lineLength(int x1, int y1, int x2, int y2) {
        return Math.abs((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }
}
