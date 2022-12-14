package Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());
        double saberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        double total;

        double additionalSabers = Math.ceil(studentsCount * 0.10);
        double totalSabers = ((studentsCount + additionalSabers) * saberPrice);
        double totalRobes = studentsCount * robePrice;
        double freeBelts = Math.floor(studentsCount / 6.00);
        double totalBelts = beltPrice * (studentsCount - freeBelts);

        total = totalBelts + totalSabers + totalRobes;

        if (money >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - money);
        }
    }
}
