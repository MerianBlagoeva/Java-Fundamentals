package Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());


        int headsetsCount = lostGamesCount / 2;
        int mouseCount = lostGamesCount / 3;
        int keyboardsCount = lostGamesCount / 6;
        int displaysCount = lostGamesCount / 12;

        double lossesTotal =
                (headsetsCount * headsetPrice)
                + (mouseCount * mousePrice)
                + (keyboardsCount * keyboardPrice)
                + (displaysCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", lossesTotal);

    }
}
