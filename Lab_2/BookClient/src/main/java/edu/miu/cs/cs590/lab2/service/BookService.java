package edu.miu.cs.cs590.lab2.service;

import edu.miu.cs.cs590.lab2.model.Book;

import java.util.List;

public interface BookService {

    Book  addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(String isbn);
    Book getBook(String isbn);
    List<Book> getAllBooks();

}
