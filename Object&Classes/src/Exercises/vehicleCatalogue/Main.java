package Exercises.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String info = sc.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();
        while (!info.equals("End")) {
            String[] infoParts = info.split(" ");
            String type = infoParts[0];
            String model = infoParts[1];
            String color = infoParts[2];
            int horsePower = Integer.parseInt(infoParts[3]);

            vehicleList.add(new Vehicle(type, model, color, horsePower));

            info = sc.nextLine();
        }
        String models = sc.nextLine();
        while (!models.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(models)) {
                    System.out.println(vehicle);
                }
            }
            models = sc.nextLine();
        }
        printAverageHorsepower(vehicleList);
    }

    public static void printAverageHorsepower(List<Vehicle> vehicleList) {
        int sumCarsHP = 0;
        int sumTrucksHP = 0;
        int countCars = 0;
        int countTrucks = 0;
        for (Vehicle vehicle : vehicleList) {
//            String type = (vehicle.getModel().equals("car") ? "yes" : "no");
            if (vehicle.getType().equals("car")) {
                countCars++;
                sumCarsHP += vehicle.getHorsePower();
            } else {
                countTrucks++;
                sumTrucksHP += vehicle.getHorsePower();
            }
        }
        double avgCars = 0;
        double avgTrucks = 0;
        if (countCars > 0) {
            avgCars = 1.00 * sumCarsHP / countCars;
        }
        if (countTrucks > 0) {
            avgTrucks = 1.00 * sumTrucksHP / countTrucks;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTrucks);
    }
}
