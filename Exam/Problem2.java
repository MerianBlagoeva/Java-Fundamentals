import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String regex = "^([\\$\\%])(?<tag>[A-Z][a-z]{2,})\\1:\\s\\[(?<number1>\\d+)\\]\\|\\[(?<number2>\\d+)\\]\\|\\[(?<number3>\\d+)\\]\\|$";

        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Valid message not found!");
            } else {

                String tag = matcher.group("tag");
                int firstNumber = Integer.parseInt(matcher.group("number1"));
                int secondNumber = Integer.parseInt(matcher.group("number2"));
                int thirdNumber = Integer.parseInt(matcher.group("number3"));

                System.out.printf("%s: %c%c%c%n", tag, (char) (firstNumber), (char) (secondNumber), (char) (thirdNumber));

            }
        }
    }
}
