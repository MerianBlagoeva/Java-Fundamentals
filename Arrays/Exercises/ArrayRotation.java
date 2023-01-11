package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numberOfRotations = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            //взимаме първия елемент и го запазваме в променлива
            int firstElement = array[0];

            //преместваме всички останали елементи с 1 наляво
            //обхождаме всички индекси от първия до предпоследния
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j + 1];


            // слагаме на последна позиция първия елемент
            array[array.length - 1] = firstElement;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
