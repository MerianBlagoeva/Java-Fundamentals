package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] commandParts = input.split(" ");
            switch (commandParts[0]) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    int firstElement = numbersArr[index1];
                    numbersArr[index1] = numbersArr[index2];
                    numbersArr[index2] = firstElement;
                    break;
                case "multiply":
                    int indexA = Integer.parseInt(commandParts[1]);
                    int indexB = Integer.parseInt(commandParts[2]);
                    numbersArr[indexA] = numbersArr[indexA] * numbersArr[indexB];
                    break;
                case "decrease":
                    for (int i = 0; i < numbersArr.length; i++) {
                        numbersArr[i]--;
                    }
                    break;
            }

            input = sc.nextLine();
        }
        for (int i = 0; i < numbersArr.length - 1; i++) {
            System.out.print(numbersArr[i] + ", ");
        }
        System.out.println(numbersArr[numbersArr.length - 1]);
    }
}
