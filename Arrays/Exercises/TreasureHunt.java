package Hello;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        The pirates must safely carry a treasure chest back to the ship, looting along the way.
        Create a program that manages the state of the treasure chest along the way. On the first line, you will receive the initial loot of the treasure chest, a string of items separated by a "|".
        "{loot1}|{loot2}|{loot3} … {loot n}"
        The following lines represent commands until "Yohoho!" which ends the treasure hunt:
        •	"Loot {item1} {item2}…{item n}":
        o	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
        o	If an item is already contained, don't insert it.
        •	"Drop {index}":
        o	Remove the loot at the given position and add it to the end of the treasure chest.
        o	If the index is invalid, skip the command.
        •	"Steal {count}":
        o	Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are.
        o	Print the stolen items separated by ", ":
        "{item1}, {item2}, {item3} … {item n}"
        In the end, output the average treasure gain, which is the sum of all treasure items length divided by the count of all items inside the chest formatted to the second decimal point:
        "Average treasure gain: {averageGain} pirate credits."
        If the chest is empty, print the following message:
        "Failed treasure hunt."

         */

        String[] treasureChest = sc.nextLine().split("\\|");


        String command = sc.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandParts[i].equals(treasureChest[i])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = commandParts[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandParts[1]);

                    if (position <= treasureChest.length - 1 && position >= 0) {
                        String dropItem = treasureChest[position];
                        for (int i = position; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    } else  {
                        break;
                    }
                    break;
                case "Steal":
                    break;
            }

            command = sc.nextLine();
        }
    }
}

