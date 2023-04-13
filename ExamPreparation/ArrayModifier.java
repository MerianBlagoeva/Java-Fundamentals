import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = sc.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                swap(index1, index2, array);
            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                multiply(index1, index2, array);
            } else {
                decrease(array);
            }
            command = sc.nextLine();
        }
        String[] result = new String[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(array[i]);
        }
        System.out.println(String.join(", ", result));
//        for (int i = 0; i < array.length - 1; i++) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println(array[array.length - 1]);
    }


    public static void swap(int index1, int index2, int[] arr) {
        int oldElement = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = oldElement;

    }

    public static void multiply(int index1, int index2, int[] arr) {
        arr[index1] = arr[index1] * arr[index2];
    }

    public static void decrease(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]--;
        }
    }
}
