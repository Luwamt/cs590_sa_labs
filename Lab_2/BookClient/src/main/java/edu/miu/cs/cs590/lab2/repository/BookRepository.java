package edu.miu.cs.cs590.lab2.repository;

import edu.miu.cs.cs590.lab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    Book getBookByIsbnContainingIgnoreCase(String isbn);
    void deleteBookByIsbnContainingIgnoreCase(String isbn);

}
