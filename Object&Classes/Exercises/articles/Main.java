package Exercises.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] articleParts = input.split(", ");
        String title =   articleParts[0];
        String content = articleParts[1];
        String author =  articleParts[2];
        Article article = new Article(title, content, author);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String change = command.split(": ")[1];
            if (command.contains("Edit")) {
                article.edit(change);
            } else if (command.contains("ChangeAuthor")) {
                article.changeAuthor(change);
            } else {
                article.rename(change);
            }
        }
        System.out.println(article);
    }
}
