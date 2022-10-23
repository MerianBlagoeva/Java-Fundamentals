import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;

        switch (type) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else if (age > 64 && age <= 122){
                    price = 12;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else if (age> 64 && age <= 122){
                    price = 15;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if ( age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122){
                    price = 10;
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
        if (price != 0) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
