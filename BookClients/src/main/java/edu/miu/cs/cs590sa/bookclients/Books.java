package edu.miu.cs.cs590sa.bookclients;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;



public class Books {

    private Collection<Book> books = new ArrayList<>();

    public Books(Collection<Book> books) {
        this.books = books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}
