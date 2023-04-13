package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, Integer> studentsPoints = new LinkedHashMap<>();
        Map<String, Integer> languageSubmissions = new LinkedHashMap<>();


        while (!command.equals("exam finished")) {
            String username = command.split("-")[0];
            if (!command.contains("banned")) {

                String language = command.split("-")[1];
                int points = Integer.parseInt(command.split("-")[2]);

                if (!studentsPoints.containsKey(username)) {
                    studentsPoints.put(username, points);
                } else {
                    if (studentsPoints.get(username) < points) {
                        studentsPoints.put(username, points);
                    }
                }
                languageSubmissions.putIfAbsent(language, 0);
                languageSubmissions.put(language, languageSubmissions.get(language) + 1);

            } else {
                studentsPoints.remove(username);
            }

            command = sc.nextLine();
        }

        System.out.println("Results:");
        studentsPoints.forEach((key, value) -> System.out.println(key + " | " + value));
        System.out.println("Submissions:");
        languageSubmissions.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
