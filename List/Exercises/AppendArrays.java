package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program to append several arrays of numbers.
        	Arrays are separated by "|".
        	Values are separated by spaces (" ", one or several).
        	Order the arrays from the last to the first and their values from left to right.
         */

        List<String> list = new ArrayList<>();
        String[] bezcherti = sc.nextLine().split("\\|");


        for (int i = bezcherti.length - 1; i >= 0; i--) {
            String currentString = bezcherti[i];
            list.add(currentString);
        }

        String bezzapetai = list.toString().replaceAll("[\\[\\],]", "");
        String[] pochti = bezzapetai.split("\\s+");
        for (int i = 0; i < pochti.length; i++) {
            System.out.print(pochti[i] + " ");
        }
    }
}
