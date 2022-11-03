package edu.miu.cs.cs590.bootjmsreceiver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String isbn;
    private String author;
    private String title;
    private Double price;



//    public Book(String isbn, String author, String title, Double price) {
//        this.isbn = isbn;
//        this.author = author;
//        this.title = title;
//        this.price = price;
//    }

//    public Book(Long bookId, String isbn, String author, String title, Double price) {
//        this.bookId = bookId;
//        this.isbn = isbn;
//        this.author = author;
//        this.title = title;
//        this.price = price;
//    }

}
