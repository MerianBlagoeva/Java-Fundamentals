package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> piecesComposers = new LinkedHashMap<>();
        Map<String, String> piecesKeys = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] commandParts = command.split("\\|");
            String piece = commandParts[0];
            String composer = commandParts[1];
            String key = commandParts[2];

            piecesComposers.putIfAbsent(piece, composer);
            piecesKeys.putIfAbsent(piece, key);


        }

        String input = sc.nextLine();
        while (!input.equals("Stop")) {
            String[] inputParts = input.split("\\|");
            switch (inputParts[0]) {
                case "Add":
                    String newPiece = inputParts[1];
                    String newComposer = inputParts[2];
                    String newKey = inputParts[3];

                    if (!piecesComposers.containsKey(newPiece)) {
                        piecesComposers.put(newPiece, newComposer);
                        piecesKeys.put(newPiece, newKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", newPiece, newComposer, newKey);
                    } else {
                        System.out.printf("%s is already in the collection!%n", newPiece);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = inputParts[1];

                    if (piecesComposers.containsKey(pieceToRemove)) {
                        piecesComposers.remove(pieceToRemove);
                        piecesKeys.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!%n", pieceToRemove);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceChange = inputParts[1];
                    String keyNew = inputParts[2];

                    if (piecesComposers.containsKey(pieceChange)) {
                        piecesKeys.put(pieceChange, keyNew);
                        System.out.printf("Changed the key of %s to %s!%n", pieceChange, keyNew);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceChange);
                    }
            }

            input = sc.nextLine();
        }
       piecesComposers.forEach((key, value) -> System.out.printf("%s -> Composer: %s, Key: %s%n", key, value, piecesKeys.get(key)));

    }
}
