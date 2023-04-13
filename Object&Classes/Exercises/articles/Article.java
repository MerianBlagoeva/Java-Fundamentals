package Exercises.articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
}
