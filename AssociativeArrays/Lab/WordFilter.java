package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Read an array of strings, and take only words whose length is even. Print each word on a new line.
         */

//        String line = new Scanner(System.in).nextLine();
//
//        String[] split = line.split("\\s+");
//        List<String> result = Arrays.stream(split)
//                .filter(s -> s.length() % 2 == 0)
//                .collect(Collectors.toList());

        Arrays.stream(sc.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
