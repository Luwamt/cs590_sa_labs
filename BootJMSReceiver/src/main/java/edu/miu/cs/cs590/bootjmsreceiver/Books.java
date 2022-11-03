package edu.miu.cs.cs590.bootjmsreceiver;

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
