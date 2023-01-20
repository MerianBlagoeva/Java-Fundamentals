package MoreExercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(modifyInput(sc.nextLine(), sc.nextLine()));

    }

    public static String modifyInput(String dataType, String input) {
        switch (dataType) {
            case "int":
                return String.format("%d", Integer.parseInt(input) * 2);
            case "real":
                return String.format("%.2f", Double.parseDouble(input) * 1.5);
            case "string":
                return String.format("$%s$", input);
            default:
                throw new IllegalArgumentException();
        }
    }
}
