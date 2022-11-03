package edu.miu.cs.cs590.lab2.controller;

import edu.miu.cs.cs590.lab2.exception.MyException;
import edu.miu.cs.cs590.lab2.model.Book;
import edu.miu.cs.cs590.lab2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = {"/books"})
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = {"/post"})
    public ResponseEntity<Book> addNewBook(@Valid @RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @PutMapping(value = {"/update/{isbn}"})
    public ResponseEntity<Book> updateBook( @PathVariable String isbn, @Valid @RequestBody Book book){
       // var result = bookService.getBook(isbn);
       var result= bookService.updateBook(book);
        return  new ResponseEntity<>(result,HttpStatus.OK);
    }

    @DeleteMapping(value = {"/delete/{isbn}"})
    public ResponseEntity<MyException> deleteBook(@PathVariable String isbn){
     var toDelete=  bookService.getBook(isbn);
     if(toDelete==null){
        return new ResponseEntity<MyException>(
                new MyException("The Book with Isbn: "+toDelete+ " not found!!!"),HttpStatus.NOT_FOUND);
    }
     bookService.deleteBook(isbn);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping(value = {"/get/{isbn}"})
    public ResponseEntity<Book> getBookById(@PathVariable String isbn){
      return   ResponseEntity.ok(bookService.getBook(isbn));
    }

    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
}
