package Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> participants = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();

        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        participants.forEach(p -> racersDistances.put(p, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "\\d";
        Pattern patternDigits = Pattern.compile(regexDigits);

        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            int distance = 0;

            Matcher matcherLetters = patternLetters.matcher(input);
            Matcher matcherDigits = patternDigits.matcher(input);

            while (matcherLetters.find()) {
                name.append(matcherLetters.group());
            }
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (participants.contains(name.toString())) {
                int currentDistance = racersDistances.get(name.toString());
                racersDistances.put(name.toString(), currentDistance + distance);
            }
            input = sc.nextLine();
        }

        List<String> names = new LinkedList<>();
        racersDistances.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
                .forEach(p -> names.add(p.getKey()));

        System.out.printf("1st place: %s\n" +
                          "2nd place: %s\n" +
                          "3rd place: %s\n", names.get(0), names.get(1), names.get(2));
    }
}
