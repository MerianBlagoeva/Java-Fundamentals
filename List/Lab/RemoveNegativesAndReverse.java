package Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read a list of integers, remove all negative numbers from it and
        print the remaining elements in reversed order.
        In case of no elements left in the list, print "empty".
         */

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbersList.removeIf(e -> e < 0);

        Collections.reverse(numbersList);

        if (numbersList.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
