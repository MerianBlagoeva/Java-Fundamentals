package Exercises;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split(" ")).
                collect(Collectors.toList());
        String input = sc.nextLine();


        while (!input.equals("3:1")) {
            if (input.contains("merge")) {
                String[] commandParts = input.split("\\s+");
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex >= list.size()) {
                    endIndex = list.size() - 1;
                }
                boolean isValid = (startIndex <= list.size() - 1 && endIndex >= 0);

                if (isValid) {
                    String merge = "";
                    for (int i = startIndex; i <= endIndex; i++) {
//                        if (!newString.contains(startInputArray[i]))
                        String currentText = list.get(i);
                        merge += currentText;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        list.remove(i);
                    }
                    list.add(startIndex, merge);
                }
            }
            input = sc.nextLine();
        }
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
