import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ordersCount = Integer.parseInt(sc.nextLine());

        double totalPrice = 0;
        for (int i = 1; i <= ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());

            double total = 0;

            total = days * capsulesCount * pricePerCapsule;
            totalPrice += total;
            System.out.printf("The price for the coffee is: $%.2f\n", total);
        }
        System.out.printf("Total: $%.2f\n", totalPrice);
    }
}
