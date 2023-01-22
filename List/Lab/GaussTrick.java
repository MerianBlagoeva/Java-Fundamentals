package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /*
       Write a program that sum all numbers in a list in the following order:
       first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
        */

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numbersList.size();

        for (int i = 0; i < sizeList / 2; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size() - 1);

            numbersList.set(i, firstNum + lastNum);
            numbersList.remove(numbersList.size() - 1);

        }
        for (int item : numbersList) {
            System.out.print(item + " ");
        }
    }
}
