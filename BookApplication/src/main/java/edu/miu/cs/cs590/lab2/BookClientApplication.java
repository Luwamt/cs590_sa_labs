package edu.miu.cs.cs590.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookClientApplication {

//    @Autowired
//    private RestOperations restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BookClientApplication.class, args);
        System.out.println("Hello spring");
    }

    //@Override
//    public void run(String... args) throws Exception {
//        String serverUrl ="http://localhost:8081/books";
//
//        //Adding books using restTemplate in bult
//        restTemplate.postForLocation(serverUrl+"/post",new Book("525-69300","John Martin","Mpp Book",70.99));
//
//        restTemplate.postForLocation(serverUrl,new Book("236-2009","Martin Davidson","Design Architecture",40.99));
//
//Book book= restTemplate.getForObject(serverUrl+ "/get/{isbn}", Book.class,"236-2009");
//
//        System.out.println("~~~~~~Get a Book by isbn ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//       // System.out.println("The ISBN Number is: "+book.getIsbn()+"\nThe Book Title is : "+ book.getTitle());
//
////Get all Books
//      // Books books = restTemplate.getForObject(serverUrl+ "/list",Books.class);
//
//        System.out.println("~~~~~~Get all Books ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//       // System.out.println(books);
//
//        System.out.println("~~~~~~Delete a Book by isbn ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//       // restTemplate.delete(serverUrl+"/delete/{isbn}","236-2009");
//
//        //update book
//      // book.setPrice(50.0);
//      // restTemplate.put(serverUrl+"/update"+book,book.getPrice());
//
//        //Get all books
//        System.out.println("~~~~~~Get all Books ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//       // System.out.println(books);
//
//
//
//    }


//    @Bean
//    RestOperations restTemplate(){
//        return  new RestTemplate();
//    }


}
