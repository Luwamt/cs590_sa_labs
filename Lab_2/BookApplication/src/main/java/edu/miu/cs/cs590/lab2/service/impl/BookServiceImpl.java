package edu.miu.cs.cs590.lab2.service.impl;


import edu.miu.cs.cs590.lab2.model.Book;
import edu.miu.cs.cs590.lab2.repository.BookRepository;
import edu.miu.cs.cs590.lab2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

    @Autowired
  private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBook(String isbn) {
        return bookRepository.
                getBookByIsbnContainingIgnoreCase(isbn);
    }
 //   @Override
//    public Book getBook(String isbn) {
//        return bookRepository.findById(Long.parseLong(isbn)).orElse(null);
//    }


    @Override
    public Book updateBook(Book book) {;
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(String isbn) {
        bookRepository.deleteBookByIsbnContainingIgnoreCase(isbn);
       // Long changeIsbn = Long.parseLong(isbn);
       //  bookRepository.deleteById(changeIsbn);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
