package edu.miu.cs.cs590.lab2.repository;

import edu.miu.cs.cs590.lab2.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {

    private Map<String,Book> books= new HashMap<>();
    public void save(Book book){
        books.put(book.getIsbn(),book);
    }
  public Book findBookByIsbn(String isbn){
    return     books.get(isbn);
  }
  public void deleteBookByIsbn(String isbn){
        books.remove(isbn);
  }
   public Collection<Book> getAllBooks(){
       return books.values();
   }
}
