package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> shelf = Arrays.stream(sc.nextLine().split("&")).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("Done")) {
            String[] inputParts = input.split(" \\| ");
            switch (inputParts[0]) {
                case "Add Book":
                    addBook(inputParts, shelf);
                    break;
                case "Take Book":
                    takeBook(inputParts, shelf);
                    break;
                case "Swap Books":
                    swapBooks(inputParts, shelf);
                    break;
                case "Insert Book":
                    insertBook(inputParts, shelf);
                    break;
                case "Check Book":
                    checkBook(inputParts, shelf);
                    break;
            }
            input = sc.nextLine();
        }
        printList(shelf);
    }

    public static void addBook(String[] inputParts, List<String> list) {
        String bookName = inputParts[1];
        if (!list.contains(bookName)) {
            list.add(0, bookName);
        }
    }

    public static void takeBook(String[] inputParts, List<String> list) {
        String bookName = inputParts[1];
        list.remove(bookName);
    }

    public static void swapBooks(String[] inputParts, List<String> list) {
        String book1 = inputParts[1];
        String book2 = inputParts[2];
        if (list.contains(book1) && list.contains(book2)) {
            int indexOfBook2 = list.indexOf(book2);
            list.set(list.indexOf(book1), book2);
            list.set(indexOfBook2, book1);
//            Collections.swap(list, list.indexOf(book1), list.indexOf(book2));
        }
    }

    public static void insertBook(String[] inputParts, List<String> list) {
        String bookName = inputParts[1];
        if (!list.contains(bookName)) {
            list.add(bookName);
        }
    }

    public static void checkBook(String[] inputParts, List<String> list) {
        int index = Integer.parseInt(inputParts[1]);
        if (index >= 0 && index < list.size()) {
            System.out.println(list.get(index));
        }
    }

    public static void printList(List<String> list) {
        System.out.println(String.join(", ", list));
    }
}
