package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        String regexDigits = "\\d";
        Pattern patternDigits = Pattern.compile(regexDigits);

        for (int i = 0; i < n; i++) {
            String barcode = sc.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            Matcher matcherDigits = patternDigits.matcher(barcode);

            if (matcher.find()) {
                String product = "";
                while (matcherDigits.find()) {
                    product += matcherDigits.group();
                }
                if (product.length() > 0) {
                    System.out.printf("Product group: %s%n", product);
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
