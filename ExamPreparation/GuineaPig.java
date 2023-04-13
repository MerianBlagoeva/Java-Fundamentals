import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double food = Double.parseDouble(sc.nextLine());
        double hay = Double.parseDouble(sc.nextLine());
        double cover = Double.parseDouble(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());

        food = convertToGrams(food);
        hay = convertToGrams(hay);
        cover = convertToGrams(cover);
        weight = convertToGrams(weight);


        for (int day = 1; day <= 30; day++) {
            food -= 300;
            if (day % 2 == 0) {
                double currentHay = food * 0.05;
                hay -= currentHay;
            }
            if (day % 3 == 0) {
                double currentCover = weight / 3;
                cover -= currentCover;
            }
            if (food <= 0 || hay <= 0 || cover <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        food /= 1000;
        hay /= 1000;
        cover /= 1000;
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hay, cover);
    }

    public static double convertToGrams(double supply) {
        return supply * 1000;
    }
}
