package Hello;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagons = Integer.parseInt(sc.nextLine());

        int[] people = new int[wagons];
        int sum = 0;
        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(sc.nextLine());
            sum += people[i];
        }
        for (int i : people) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
