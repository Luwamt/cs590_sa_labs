package edu.miu.cs.cs590.lab2.service;

import edu.miu.cs.cs590.lab2.integration.EmailSender;
import edu.miu.cs.cs590.lab2.integration.JmsSender;
import edu.miu.cs.cs590.lab2.model.Book;
import edu.miu.cs.cs590.lab2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    JmsSender jmsSender;

//    @Autowired
//    EmailSender emailSender;

    public void add(Book book){
        bookRepository.save(book);
       // emailSende.sendEmail
        jmsSender.sendMessage(book);
    }

    public void update(Book book){
        bookRepository.save(book);
        jmsSender.sendMessage(book);
    }

    public Book findByIsbn(String isbn){
       return bookRepository.findBookByIsbn(isbn);
    }

    public void delete(String isbn){
       // Book book= bookRepository.findBookByIsbn(isbn);
        bookRepository.deleteBookByIsbn(isbn);
    }
    public Collection<Book> findAll(){
      return   bookRepository.getAllBooks();
    }
}
