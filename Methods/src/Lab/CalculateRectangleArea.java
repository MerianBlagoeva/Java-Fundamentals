package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {

        // Create a method that calculates and returns the area of a rectangle
        // by given width and length.
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        System.out.println(calculateArea(width,length));

    }
    public static int calculateArea(int width, int length) {
        return width * length;
    }
}
