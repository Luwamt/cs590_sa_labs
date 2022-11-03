package edu.miu.cs.cs590sa.bookclients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookClientsApplication  implements CommandLineRunner {
    @Autowired
    private RestOperations restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BookClientsApplication.class, args);
        System.out.println("Hello from book Client");
    }

    @Override
    public void run(String... args) throws Exception {

        String serverUrl ="http://localhost:8081/book";

        //Adding books using restTemplate in bult
        restTemplate.postForLocation(serverUrl+"/post",new Book("0215-53012520","John Martin"," Java Engineering",30.99));

        restTemplate.postForLocation(serverUrl+"/post",new Book("3695-52533","Brain Davidson","Architecture Patterns",70.99));

     Book book= restTemplate.getForObject(serverUrl+ "/get/{isbn}", Book.class,"3695-52533");

        System.out.println("~~~~~~Get a Book by isbn ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The ISBN Number is: "+book.getIsbn()+"\nThe Book Title is : "+ book.getTitle());

        //Get All Books
       // Books books= restTemplate.getForObject(serverUrl+"/list", Books.class);
       // System.out.println("~~~~~~Get all Books  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       // System.out.println(books);
    }

    @Bean
    RestOperations restTemplate(){
        return  new RestTemplate();
    }
}
