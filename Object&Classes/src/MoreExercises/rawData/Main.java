package MoreExercises.rawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carsNumber = Integer.parseInt(sc.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < carsNumber; i++) {
            String input = sc.nextLine();
            String[] carParameters = input.split(" ");
            String model = carParameters[0];
            int engineSpeed = Integer.parseInt(carParameters[1]);
            int enginePower = Integer.parseInt(carParameters[2]);
            int cargoWeight = Integer.parseInt(carParameters[3]);
            String cargoType = carParameters[4];
            double tire1Pressure = Double.parseDouble(carParameters[5]);
            int tire1Age = Integer.parseInt(carParameters[6]);
            double tire2Pressure = Double.parseDouble(carParameters[7]);
            int tire2Age = Integer.parseInt(carParameters[8]);
            double tire3Pressure = Double.parseDouble(carParameters[9]);
            int tire3Age = Integer.parseInt(carParameters[10]);
            double tire4Pressure = Double.parseDouble(carParameters[11]);
            int tire4Age = Integer.parseInt(carParameters[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire1 = new Tire(tire1Pressure, tire1Age);
            Tire tire2 = new Tire(tire2Pressure, tire2Age);
            Tire tire3 = new Tire(tire3Pressure, tire3Age);
            Tire tire4 = new Tire(tire4Pressure, tire4Age);
            Tire[] tires = {tire1, tire2, tire3, tire4};

            Car car = new Car(model, engine, cargo, tires);
            carList.add(car);

        }

        String command = sc.nextLine();

        List<Car> listToPrint = new ArrayList<>();
        printCars(command, carList, listToPrint);

        for (Car car : listToPrint) {
            System.out.println(car.getModel());
        }
    }

    public static void printCars(String command, List<Car> carList, List<Car> listToPrint) {
        boolean firstCondition;
        for (Car car : carList) {
            for (int i = 0; i < car.getTires().length; i++) {
                firstCondition = car.getTires()[i].getPressure() < 1 && car.getCargo().getType().equals("fragile");
                if (command.equals("fragile") && firstCondition) {
                    addCar(listToPrint, car);
                }
            }
            boolean secondCondition = car.getEngine().getPower() > 250 && car.getCargo().getType().equals("flamable");

            if (command.equals("flamable")) {
                if (secondCondition) {
                    addCar(listToPrint, car);
                }
            }
        }
    }

    public static void addCar(List<Car> listToPrint, Car car) {
        if (!listToPrint.contains(car)) {
            listToPrint.add(car);
        }
    }
}
