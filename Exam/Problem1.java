import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String spell = sc.nextLine();

        String command = sc.nextLine();

        while (!command.equals("Abracadabra")) {
            String[] commandParts = command.split("\\s+");
            switch (commandParts[0]) {
                case "Abjuration":
                    spell = spell.toUpperCase();
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase();
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(commandParts[1]);
                    String letter = commandParts[2];

                    if (index >= 0 && index < spell.length()) {
                        String oldLetter = String.valueOf(spell.charAt(index));
                        spell = spell.replaceFirst(oldLetter, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = commandParts[1];
                    String secondSubstring = commandParts[2];

                    if (spell.contains(firstSubstring)) {
                        spell = spell.replace(firstSubstring, secondSubstring);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String substring = commandParts[1];
                    if (spell.contains(substring)) {
                        spell = spell.replace(substring, "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }

            command = sc.nextLine();
        }
    }
}
