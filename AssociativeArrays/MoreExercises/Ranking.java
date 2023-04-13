package MoreExercises;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, String> contents = new LinkedHashMap<>();
        while (!command.equals("end of contests")) {
            String[] commandParts = command.split(":");
            String contest = commandParts[0];
            String password = commandParts[1];
            contents.putIfAbsent(contest, password);


            command = sc.nextLine();
        }
        String input = sc.nextLine();
        Map<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();
        while (!input.equals("end of submissions")) {
            String[] commandParts = input.split("=>");
            String contest = commandParts[0];
            String password = commandParts[1];
            String username = commandParts[2];
            int points = Integer.parseInt(commandParts[3]);


            if (contents.containsKey(contest) && contents.get(contest).equals(password)) {

                LinkedHashMap<String, Integer> course = new LinkedHashMap<>();
                course.put(contest, points);

                if (!users.containsKey(username)) {
                    users.put(username, course);
                } else {
                    if (!users.get(username).containsKey(contest)) {
                        users.get(username).put(contest, points);
                    } else {
                        users.get(username).put(contest, Math.max(points, users.get(username).get(contest)));
                    }
                }
            }

            input = sc.nextLine();
        }
        int totalSum = 0;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
