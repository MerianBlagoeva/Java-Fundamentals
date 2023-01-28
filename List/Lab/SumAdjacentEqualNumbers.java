package Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
        	After two numbers are summed, the obtained result could be equal to some of its neighbors
            and should be summed as well (see the examples below).
        	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).

        3 3 6 1-> 6 6 1  12 1
         */

        List<Double> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i + 1);
            if (currentNum == nextNum) {
                numbersList.set(i, currentNum + nextNum);
                numbersList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbersList, " "));

    }
    public static String joinElementsByDelimiter(List<Double> list, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }
}
