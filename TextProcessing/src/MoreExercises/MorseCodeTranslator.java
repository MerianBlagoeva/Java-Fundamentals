package MoreExercises;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] morseCode = sc.nextLine().split(" ");


        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z",};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < morseCode.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                String currentInputLetter = morseCode[i];
                String currentMorseLetter = morse[j];

                if (currentInputLetter.equals(currentMorseLetter)) {
                    sb.append(english[j]);
                }
            }
            if (morseCode[i].equals("|")) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().toUpperCase());
    }
}
