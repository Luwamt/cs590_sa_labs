package edu.miu.cs.cs590.lab2.controller;

import edu.miu.cs.cs590.lab2.model.Book;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Books {

    private Collection<Book> books = new ArrayList<>();

    public Collection<Book> getBooks() {
        return books;
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
