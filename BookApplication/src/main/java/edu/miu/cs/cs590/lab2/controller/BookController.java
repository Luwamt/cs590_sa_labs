package edu.miu.cs.cs590.lab2.controller;

import edu.miu.cs.cs590.lab2.exception.MyException;
import edu.miu.cs.cs590.lab2.model.Book;
import edu.miu.cs.cs590.lab2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = {"/book/get/{isbn}"})
    public ResponseEntity<?> getBookById(@PathVariable String isbn){
        var getBook=  bookService.findByIsbn(isbn);
        if(getBook==null){
            return new ResponseEntity<MyException>(
                    new MyException("The Book with Isbn: "+isbn+ " not found!!!"),HttpStatus.NOT_FOUND);

        }
        return  new ResponseEntity<Book>(getBook,HttpStatus.OK);
    }

    @PostMapping(value = {"/book/post"})
    public ResponseEntity<Book> addNewBook( @RequestBody Book book){
       bookService.add(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value = {"/book/update/{isbn}"})
    public ResponseEntity<Book> updateBook( @PathVariable String isbn,  @RequestBody Book book){
         bookService.update(book);
        return  new ResponseEntity<>(book,HttpStatus.OK);
    }

    @DeleteMapping(value = {"/book/delete/{isbn}"})
    public ResponseEntity<MyException> deleteBook(@PathVariable String isbn){
     var toDelete=  bookService.findByIsbn(isbn);
     if(toDelete==null){
        return new ResponseEntity<MyException>(
                new MyException("The Book with Isbn: "+toDelete+ " not found!!!"),HttpStatus.NOT_FOUND);
    }
     bookService.delete(isbn);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping(value = {"/book/list"})
    public ResponseEntity<?> getAllBooks(){
        Books allBooks = new Books();
        allBooks.setBooks(bookService.findAll());
        return new ResponseEntity<Books>(allBooks,HttpStatus.OK);
    }
}
