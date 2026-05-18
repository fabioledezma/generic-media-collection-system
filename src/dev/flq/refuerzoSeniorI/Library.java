package dev.flq.refuerzoSeniorI;
import java.util.List;
import java.util.ArrayList;

public class Library {

    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public void printBooks() {
        System.out.println(books);
    }
}
