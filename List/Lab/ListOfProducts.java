package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Read a number n and n lines of products.
        Print a numbered list of all the products ordered by name.
         */

        int n = Integer.parseInt(sc.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = sc.nextLine();
            productList.add(product);
        }
        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 +"." + productList.get(i));
        }
    }
}
