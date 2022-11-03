package edu.miu.cs.cs590.lab2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
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
