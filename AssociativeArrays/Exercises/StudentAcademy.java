package Exercises;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program that keeps the information about students and their grades.
        On the first line, you will receive number n. After that, you will receive n pair of rows. First, you will receive the student's name, after that, you will receive his grade. Check if the student already exists and if not - add him. Keep track of all grades for each student.
        When you finish reading data, keep students with an average grade higher or equal to 4.50.
        Print the students and their average grade in the format:
        "{name} –> {averageGrade}"
        Format the average grade to the 2nd decimal place.
         */

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name, new ArrayList<>());
            }
            studentsGrades.get(name).add(grade);
        }
        Map<String, Double> avgGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            double avg = entry.getValue().stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .getAsDouble();

            if (avg >= 4.50) {
                avgGrade.put(entry.getKey(), avg);
            }
        }
        avgGrade.forEach((key, value) ->
                System.out.printf("%s -> %.2f%n", key, value));
    }
}
