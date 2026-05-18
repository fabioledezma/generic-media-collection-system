package dev.flq.refuerzoSeniorII;

import dev.flq.refuerzoSeniorI.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<dev.flq.refuerzoSeniorI.Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(dev.flq.refuerzoSeniorI.Book book) {
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
