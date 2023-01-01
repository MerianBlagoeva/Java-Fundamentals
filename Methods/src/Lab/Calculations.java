package Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that receives a string on the first line
        ("add", "multiply", "subtract", "divide")
        and on the next two lines receives two numbers.
        Create four methods (for each calculation) and
        invoke the right one depending on the command.
        The method should also print the result (it needs to be void).
         */

        String command = sc.nextLine();
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        switch (command) {
            case "add":
                printAddedNumbers(firstNum,secondNum);
                break;
            case "multiply":
                printMultipliedNumbers(firstNum,secondNum);
                break;
            case "subtract":
                printSubtractedNumbers(firstNum,secondNum);
                break;
            case "divide":
                printDividedNumbers(firstNum,secondNum);
                break;
        }


    }

    public static void printAddedNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    public static void printMultipliedNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    public static void printSubtractedNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    public static void printDividedNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}
