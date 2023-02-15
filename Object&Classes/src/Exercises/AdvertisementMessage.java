package Exercises;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {

        /*
        Write a program that generates random fake advertisement messages to extol some product. The messages must consist of 4 parts:
        laudatory phrase + event + author + city. Use the following predefined parts:
         */
        Scanner sc = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String randomPhrase = getRandomWord(phrases);
            String randomEvent = getRandomWord(events);
            String randomAuthor = getRandomWord(authors);
            String randomCity = getRandomWord(cities);
            System.out.printf("%s %s %s - %s%n", randomPhrase, randomEvent, randomAuthor, randomCity);
        }
    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
