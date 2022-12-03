package Hello;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");

        for (String itemSecondArr : secondArray) {
            for (String itemFirstArr : firstArray) {
                if (itemSecondArr.equals(itemFirstArr)) {
                    System.out.print(itemSecondArr + " ");
                }
            }
        }
    }
}
