package Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read a list of real numbers and print them in ascending order along with their number of occurrences.
         */

        double[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();


        TreeMap<Double, Integer> counts = new TreeMap<>();
        for (double num : numbers) {
//            if (!counts.containsKey(num)) {
//                counts.put(num, 0);
//            }
//            counts.put(num, counts.get(num) + 1);
//        }

            counts.putIfAbsent(num, 0);
            counts.put(num, counts.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
