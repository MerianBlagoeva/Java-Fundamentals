package Hello;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");

        for (int i = 0; i < array.length / 2; i++) {
            String oldElement = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", array));
    }
}
