package Lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You are going to receive two lists with numbers.
        Create a result list that contains the numbers from both of the lists.
        The first element should be from the first list, the second from the second list,
        and so on. If the length of the two lists is not equal,
        just add the remaining elements at the end of the list.
         */

        List<Integer> numbersList1 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbersList2 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int smallerSize = Math.min(numbersList1.size(), numbersList2.size());
//        int count = 0;

        for (int i = 0; i < smallerSize; i++) {
            int numFirstList = numbersList1.get(i);
            int numSecondList = numbersList2.get(i);

            resultList.add(numFirstList);
            resultList.add(numSecondList);
//            count++;
        }

        if (numbersList1.size() > numbersList2.size()) {
            resultList.addAll(numbersList1.subList(smallerSize, numbersList1.size()));
        } else if (numbersList2.size() > numbersList1.size()) {
            resultList.addAll(numbersList2.subList(smallerSize, numbersList2.size()));
        }

//        addRemainingElements(getBiggerList(numbersList1, numbersList2), resultList, count);

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
//
//    private static void addRemainingElements(List<Integer> list, List<Integer> resultList, int count) {
//        for (int i = count; i < list.size(); i++) {
//            resultList.add(list.get(i));
//        }
//    }
//
//    public static List<Integer> getBiggerList(List<Integer> a, List<Integer> b) {
//        return (a.size() > b.size()) ? a : b;
//
//    }
}
