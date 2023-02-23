package MoreExercises.carSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] engineInfo = input.split(" ");

            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);
            Engine engine = new Engine(model, power);

                engine.setEfficiency("n/a");
                engine.setDisplacement("n/a");

            if (engineInfo.length == 4) {
                String efficiency = engineInfo[3];
                engine.setEfficiency(efficiency);
                String displacement = engineInfo[2];
                engine.setDisplacement(displacement);
            }

            if (engineInfo.length == 3) {
                for (int j = 0; j < engineInfo[2].length(); j++) {
                    char c = engineInfo[2].toCharArray()[j];
                    if (Character.isDigit(c)) {
                        String displacement = engineInfo[2];
                        engine.setDisplacement(displacement);
                    } else {
                        engine.setEfficiency(engineInfo[2]);
                    }
                }
            }
            engines.add(engine);
        }


        int m = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < m; i++) {
            String input2 = sc.nextLine();
            String[] carInfo = input2.split("\\s+");
            String carModel = carInfo[0];
            String carEngine = carInfo[1];


            Car car = new Car(carModel, setNewEngine(engines, carEngine, carModel, 0));

                car.setColor("n/a");
                car.setWeight("n/a");

            if (carInfo.length == 3) {
                for (int j = 0; j < carInfo[2].length(); j++) {
                    char c = carInfo[2].toCharArray()[j];
                    if (Character.isDigit(c)) {
                        String weight = carInfo[2];
                        car.setWeight(weight);
                    } else {
                        String color = carInfo[2];
                        car.setColor(color);
                    }
                }
            }
            if (carInfo.length == 4) {
                String color = carInfo[3];
                car.setColor(color);
                car.setWeight(carInfo[2]);
            }

            carList.add(car);
        }
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public static Engine setNewEngine(List<Engine> engineList, String engineModel, String model, int power) {
        for (Engine eng : engineList) {
            if (eng.getModel().equals(engineModel)) {
                return eng;
            }
        }
        return new Engine(model, power);
    }
}
