package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You will be given two hands of cards, which will be integer numbers.
        Assume that you have two players. You must find the winning deck and, respectively, the winner.
        You start from the beginning of both hands. Compare the cards from the first deck to those from the second.
        The player, who has a bigger card, takes both cards and puts them on the back
        of his hand - the second player's card is last, and the first person's card (the winning one) is before it (second to last),
        and the player with the smaller card must remove the card from his deck.
        If both players' cards have the same values - no one wins, and the two cards must be removed from the decks.
        The game is over when one of the decks is left without any cards.
        You have to print the winner on the console and the sum of the left cards: "{First/Second} player wins! Sum: {sum}".
         */

        List<Integer> firstHand = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (Math.min(firstHand.size(), secondHand.size()) > 0) {
            for (int i = 0; i < Math.min(firstHand.size(), secondHand.size()); i++) {
                int firstCurrentCard = firstHand.get(i);
                int secondCurrentCard = secondHand.get(i);

                if (firstCurrentCard > secondCurrentCard) {
                    firstHand.remove(i);
                    firstHand.add(firstCurrentCard);
                    firstHand.add(secondCurrentCard);
                    secondHand.remove(i);
                } else if (secondCurrentCard > firstCurrentCard) {
                    secondHand.remove(i);
                    secondHand.add(secondCurrentCard);
                    secondHand.add(firstCurrentCard);
                    firstHand.remove(i);
                } else {
                    firstHand.remove(i);
                    secondHand.remove(i);
                }
                i = -1;
            }
        }
        if (firstHand.size() > secondHand.size()) {
            System.out.printf("First player wins! Sum: %d", findSum(firstHand));
        } else {
            System.out.printf("Second player wins! Sum: %d", findSum(secondHand));
        }
    }

    public static int findSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

}
